package com.Ecommerce.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecommerce.Entity.Cart;
import com.Ecommerce.Entity.Register;

@Repository
public interface CartDao extends JpaRepository<Cart,Integer>{
	
	public List<Cart> findByRegister(Register register);

}
