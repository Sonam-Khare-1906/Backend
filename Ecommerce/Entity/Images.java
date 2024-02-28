package com.Ecommerce.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="image_model")
public class Images{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    
    @Column(length=50000000)
    private byte[] picByte;
   

	public Images( String name, String type, byte[] picByte) {
		super();
		
		this.name = name;
		this.type = type;
		this.picByte = picByte;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getType() {
		return type;
	}





	public void setType(String type) {
		this.type = type;
	}





	public byte[] getPicByte() {
		return picByte;
	}





	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}





	public Images() {
		super();
		// TODO Auto-generated constructor stub
	}




    
}
