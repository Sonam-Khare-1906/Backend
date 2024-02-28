package com.Ecommerce.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Ecommerce.Entity.Role;


@Repository
public interface RoleDao extends JpaRepository<Role, String>{

	Role findByRoleName(String string);

	
}
