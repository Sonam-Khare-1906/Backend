package com.Ecommerce.Entity;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Register {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private long mobileno;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String confirmpassword;
	private int age;
	private String Address;
	private String City;
	private String State;
	private String Role;
	
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(name="register_ROLE",
	joinColumns= {
			@JoinColumn(name="register_ID")
	},
	inverseJoinColumns= {
			@JoinColumn(name="ROLE_ID")
	}
	)
	private Set<Role> role;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Register(int id, long mobileno, String firstname, String lastname, String email, String password,
			String confirmpassword, int age, String address, String city, String state) {
		super();
		Id = id;
		this.mobileno = mobileno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.age = age;
		Address = address;
		City = city;
		State = state;
	}
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
