package com.Ecommerce.Services;

import java.util.List;

import com.Ecommerce.Entity.Products;
import com.Ecommerce.Entity.Register;

public interface RegisterInterface {

	List<Register> getRegister(String parseLong);

	List<Register> getRegister();

	Register addRegister(Register register);

	Register updateRegister(Register register);


//	void initRolesAndUsers();
//
//	void initRolesAndUser();

//	void deleteRegister(long parseLong);

}
