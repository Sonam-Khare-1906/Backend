package com.Ecommerce.Services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Ecommerce.DAO.ProductsDAO;

import com.Ecommerce.Entity.Products;

@Service
public class ProductsServiceImpl implements ProductsInterface {

    @Autowired
    private ProductsDAO productsdao;

   public Products addNewProduct(Products product) {
	 return productsdao.save(product);
	
	   
   }

public List<Products> getAllProducts(String searchKey) {
	if(searchKey.equals(""))
{
		return (List<Products>)productsdao.findAll();
	}
	else {
		return (List<Products>)	productsdao.findByPnameContainingIgnoreCaseOrPdescriptionContainingIgnoreCase(searchKey,searchKey);
	}
}

public void deleteProductDetails(int pid) {
	productsdao.deleteById(pid);
}

public Products getProductDetailsById(int pid)
{
	return productsdao.findById(pid).get();
}


public List<Products> getProductDetails(boolean isSingleProductCheckout,int pid) {
	if(isSingleProductCheckout) {
		//we are buy single product
		List<Products> list=new ArrayList<>();
	Products product=productsdao.findById(pid).get();
	list.add(product);
	return list;
	}
	else{
		//we are going to checkout entire cart
		
		return new ArrayList<>();
	}
	
}
}
