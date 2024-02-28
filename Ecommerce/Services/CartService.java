package com.Ecommerce.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.DAO.CartDao;
import com.Ecommerce.DAO.ProductsDAO;
import com.Ecommerce.DAO.RegisterDAO;
import com.Ecommerce.Entity.Cart;
import com.Ecommerce.Entity.Products;
import com.Ecommerce.Entity.Register;

@Service
public class CartService {

	@Autowired
	private CartDao cartdao;
	
	@Autowired
	private ProductsDAO productsdao;
	
	@Autowired
	private RegisterDAO registerdao;
	
	public Cart addToCart(int pid,String firstname) {
	Products product=productsdao.findById(pid).get();
	
	Register register=null;
	if(product != null) {
	  register =registerdao.findById(firstname).get();
	}
	
	if(product != null && register != null) {
		Cart cart= new Cart(product,register);
		return cartdao.save(cart);
		
	}
	
	return null;
	}
	
//	public List<Cart> getCarDetails(){
//		String firstname=
//	}
}
