package com.Ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Services.CartService;

@RestController
public class CartController {
	
	@Autowired
	private CartService cartservice;
	
    @GetMapping("/addToCart/{pid}")
    public void addToCart(@PathVariable(name = "pid") Integer pid, @RequestParam(name = "firstname") String firstname) {
        cartservice.addToCart(pid, firstname);
    }
    
    @GetMapping({"/getCartDetails"})
    public void getCartDetails() {
    	
    }
}
