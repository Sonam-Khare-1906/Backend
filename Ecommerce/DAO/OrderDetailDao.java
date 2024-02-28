package com.Ecommerce.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce.Entity.OrderDetail;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Integer>{

}
