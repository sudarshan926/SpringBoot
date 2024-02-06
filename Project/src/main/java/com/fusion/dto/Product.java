package com.fusion.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	@Column
	@GeneratedValue
	private int id;
	private String type;
	private String Status;
	
	@OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "productDetails_ID", referencedColumnName = "id")
	private ProductDetails productDetails;
	
	
	public ProductDetails getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	public Product(int id, String type, String status, ProductDetails productDetails) {
		super();
		this.id = id;
		this.type = type;
		Status = status;
		this.productDetails = productDetails;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", type=" + type + ", Status=" + Status + ", productDetails=" + productDetails
				+ "]";
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
}