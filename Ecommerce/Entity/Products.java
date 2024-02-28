package com.Ecommerce.Entity;


import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;

    private String pname;
    @Column(length=2000)
    private String pdescription;
    private double pprice;
    private int pquantity;
	
    @ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinTable(name="product_images",joinColumns= {
    		@JoinColumn(name="pid")
    },
    inverseJoinColumns= {
    		@JoinColumn(name="id")
    })
	private Set<Images> productImages;
	

	public Set<Images> getProductImages() {
		return productImages;
	}

	public void setProductImages(Set<Images> productImages) {
		this.productImages = productImages;
	}




	public int getPid() {
		return pid;
	}




	public void setPid(int pid) {
		this.pid = pid;
	}




	public String getPname() {
		return pname;
	}




	public void setPname(String pname) {
		this.pname = pname;
	}




	public String getPdescription() {
		return pdescription;
	}




	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}




	public double getPprice() {
		return pprice;
	}




	public void setPprice(double pprice) {
		this.pprice = pprice;
	}




	public int getPquantity() {
		return pquantity;
	}




	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}



	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

}