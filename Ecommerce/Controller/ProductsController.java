package com.Ecommerce.Controller;

import org.springframework.http.MediaType;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Ecommerce.Entity.Images;
import com.Ecommerce.Entity.Products;
import com.Ecommerce.Services.ProductsInterface;
import com.Ecommerce.Services.ProductsServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;



@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ProductsController {

	@Autowired
	private ProductsServiceImpl productservice;
	
	
	//@PreAuthorize("hasRole("Admin")")
	@PostMapping(value={"/addNewProduct"},consumes= {MediaType.MULTIPART_FORM_DATA_VALUE})
	public Products addNewProduct(@RequestPart ("products")Products products,
								  @RequestPart("imagesFile") MultipartFile[] file) {
		
		try {
			Set<Images>image =uploadImage(file);
			products.setProductImages(image);
		return productservice.addNewProduct(products);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

		
	}
	
	public Set<Images> uploadImage(MultipartFile[] multipartFiles) throws IOException {
		Set<Images> images =new HashSet<>();
		
		for(MultipartFile file:multipartFiles) {
			Images image =new Images(
					file.getOriginalFilename(),
					file.getContentType(),
					file.getBytes());
			
			images.add(image);
		}
		return images;
	}
	
	  @GetMapping("/getAllProducts")
	  public List<Products> getAllProducts(@RequestParam(defaultValue="")String searchKey)
	{
	List<Products> result= productservice.getAllProducts(searchKey);
	System.out.println("Result size is"+result.size());
	return result;
		  
	  }
	
	@DeleteMapping({"/deleteProductDetails/{pid}"})
	public void deleteProductDetails(@PathVariable("pid") Integer pid) {
		productservice.deleteProductDetails(pid);
		
	}
	
	
	@GetMapping({"getProductDetailsById/{pid}"})
	public Products getProductDetailsById(@PathVariable("pid") Integer pid) {
		return productservice.getProductDetailsById(pid);
	}
	
	@GetMapping({"/getProductDetails/{isSingleProductCheckout}/{pid}"})
	public List<Products> getProductDetails(@PathVariable (name="isSingleProductCheckout" )boolean isSingleProductCheckout, 
			                     @PathVariable (name="pid")	int pid) {
		
		return productservice.getProductDetails(isSingleProductCheckout,pid);
		
	}
	
}
	