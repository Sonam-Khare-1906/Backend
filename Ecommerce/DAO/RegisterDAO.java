package com.Ecommerce.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Ecommerce.Entity.Register;

@EnableJpaRepositories
public interface RegisterDAO extends JpaRepository<Register,String>{
	public List<Register> findByEmail(String email);

}
