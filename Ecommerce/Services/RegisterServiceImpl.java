package com.Ecommerce.Services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.DAO.RegisterDAO;
//import com.Ecommerce.DAO.RoleDao;
import com.Ecommerce.Entity.Register;
//import com.Ecommerce.Entity.Role;

@Service
public class RegisterServiceImpl implements RegisterInterface{
    
    @Autowired
    private RegisterDAO registerdao;
    
//    @Autowired
//    private RoleDao roledao;

    @Override
    public List<Register> getRegister() {
        return registerdao.findAll();
    }

    @Override
    public List<Register> getRegister(String registerId) {
        return (List<Register>)registerdao.findByEmail(registerId);
    }


    @Override
    public Register addRegister(Register register) {
        return registerdao.save(register);
    }


    @Override
    public Register updateRegister(Register register) {
        return registerdao.save(register);
    }

    
    
    
//    public void initRolesAndUser() {
//    	Role adminRole=new Role();
//    	adminRole.setRoleName("Admin");
//   	adminRole.setRoleDescription("Admin Role");
//   	roledao.save(adminRole);
//    	
//   	
//   	Role registerRole=new Role();
//   	registerRole.setRoleName("Register User");
//   	registerRole.setRoleDescription(" Default role for newly Register user Role");
//    	roledao.save(registerRole);
//    	
//   	
//   	Register adminUser= new Register();
//    	adminUser.setFirstname("admin");
//  	adminUser.setLastname("admin");
//    	adminUser.setPassword("admin@123");
//   	adminUser.setEmail("admin@gmail.com");	
//   	Set<Role> adminRoles=new HashSet<>();
//   	adminRoles.add(adminRole);
//    	adminUser.setRole(adminRoles); // Set roles using setRole method
//   	registerdao.save(adminUser);
//   	
//   	   	
//    	
//   	Register RegisterUser= new Register();
//    	 RegisterUser.setFirstname("sonam");
//    	 RegisterUser.setLastname("khare");
//   	 RegisterUser.setPassword("sonam@123");
//   	 RegisterUser.setEmail("sonam@gmail.com");
//    	Set<Role> registerRoles=new HashSet<>();
//    	registerRoles.add(registerRole);
//    	RegisterUser.setRole(registerRoles);
//   	registerdao.save(RegisterUser);   	
//    	
//    	
//   }
//
//	@Override
//	public void initRolesAndUsers() {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void initRolesAndUser() {
//		// TODO Auto-generated method stub
//		
//	}
}
