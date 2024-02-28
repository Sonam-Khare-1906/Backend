package com.Ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Entity.OrderInput;
import com.Ecommerce.Services.OrderDetailService;

@RestController
public class OrderDetailController {
	
	@Autowired
	private OrderDetailService orderDetailService;

	
//	@PostMapping({"/placeOrder"})
//	public void placeOrder(@RequestBody OrderInput orderInput) {
//		
//		orderDetailService.placeOrder(orderInput);
//	}
	 @PostMapping("/placeOrder")
	    public ResponseEntity<String> placeOrder(@RequestBody OrderInput orderInput) {
	        orderDetailService.placeOrder(orderInput);
	        return ResponseEntity.ok("Order placed successfully");
	    }
}
