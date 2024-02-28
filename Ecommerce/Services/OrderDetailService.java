package com.Ecommerce.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.DAO.OrderDetailDao;
import com.Ecommerce.DAO.ProductsDAO;
import com.Ecommerce.DAO.RegisterDAO;
import com.Ecommerce.Entity.OrderDetail;
import com.Ecommerce.Entity.OrderInput;
import com.Ecommerce.Entity.OrderProductQuantity;
import com.Ecommerce.Entity.Products;
import com.Ecommerce.Entity.Register;

@Service
public class OrderDetailService {
	
	private static String ORDER_PLACED = "placed";
	
	@Autowired
	private OrderDetailDao orderDetaildao;
	
	 @Autowired
	    private ProductsDAO productsdao;
	 
	 @Autowired
	 private RegisterDAO registerdao;


	
     public void placeOrder(OrderInput orderInput) {
		List<OrderProductQuantity> productQuantityList = orderInput.getOrderProductQuantityList();
//		
//		for(OrderProductQuantity o:productQuantityList) {
//	Products product=productsdao.findById(o.getPid()).get();
//	
//	String currentUser =JwtRequestFilter.getCurrentUser();
//	Register user=registerdao.findById(currentUser).get();
//			OrderDetail orderdetail=new OrderDetail( 
//					orderInput.getFullName(),
//					orderInput.getContactNumber(),
//					orderInput.getAlternateContactNumber(),
//					orderInput.getFullAddress(),
//					ORDER_PLACED,
//					product.getPprice()*o.getQuantity(),
//					product,
//					register,
//					);
//			
//			orderDetaildao.save(orderdetail);
//		}
	}

}
