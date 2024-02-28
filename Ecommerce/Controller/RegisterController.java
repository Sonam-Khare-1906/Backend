package com.Ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Entity.Products;
import com.Ecommerce.Entity.Register;
import com.Ecommerce.Services.RegisterInterface;

import jakarta.annotation.PostConstruct;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RegisterController {
	
	@Autowired
	private RegisterInterface registerservice; 
	
//	@PostConstruct
//	public void initRolesAndUsers() {
//		registerservice.initRolesAndUsers();
//	}
	
//	@GetMapping({"/forAdmin"})
//	public String forAdmin() {
//		return "This URL is only accessible to admin"; 
//	}
//	
//	@GetMapping({"/forUser"})
//	public String forUser() {
//		return "This URL is only accessible to user"; 
//	}
//	
	@GetMapping("/Register")
	  public List<Register> getRegister() {
			
			return registerservice.getRegister();
		  
	  }

		
		//get the specific product
		@GetMapping("/Register/{registerId}")
		public Register getRegister(@PathVariable String registerId)
	{
			List<Register> registerlist=this.registerservice.getRegister((registerId));
			if(registerlist.size()>0) {
				return registerlist.get(0);
			}
			else {
				return null;
			}
			
	}
		
		//Add Some products
		@PostMapping("/Register")
		public Register addRegister(@RequestBody Register register) 
		{
//			System.out.println(register);
			return this.registerservice.addRegister(register);
		}
		
		
		
		//Update products
		@PutMapping("/Register")
		public Register updateRegister(@RequestBody Register register) {
			return this.registerservice.updateRegister(register);
		}
		
		
		//Delete a products
//		@DeleteMapping("/Register/{registerId}")
//		public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String registerId)
//		{
//		 try {
//			this.registerservice.deleteRegister(Long.parseLong(registerId));
//			return new ResponseEntity<>(HttpStatus.OK);
//		}
//		 catch(Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR) ;
//		 }
	//}

}
