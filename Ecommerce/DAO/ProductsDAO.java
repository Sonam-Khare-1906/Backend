package com.Ecommerce.DAO;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.multipart.MultipartFile;


import com.Ecommerce.Entity.Products;

@EnableJpaRepositories
public interface ProductsDAO extends JpaRepository<Products, Integer> {
public List<Products> findByPnameContainingIgnoreCaseOrPdescriptionContainingIgnoreCase(String key1,
		String key2);


}
