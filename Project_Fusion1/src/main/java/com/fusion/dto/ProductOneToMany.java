package com.fusion.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class ProductOneToMany {

	@Id
	@Column
	@GeneratedValue
	private int id;

	private String type;
	private String status;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "productOneToMany_id")
	private List<ProductDetailsOneToMany> productDetailsList;

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
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<ProductDetailsOneToMany> getProductDetailsList() {
		return productDetailsList;
	}

	public void setProductDetailsList(List<ProductDetailsOneToMany> productDetailsList) {
		this.productDetailsList = productDetailsList;
	}

	public ProductOneToMany(int id, String type, String status, List<ProductDetailsOneToMany> productDetailsList) {
		super();
		this.id = id;
		this.type = type;
		this.status = status;
		this.productDetailsList = productDetailsList;
	}
	@Override
	public String toString() {
		return "ProductOneToMany [id=" + id + ", type=" + type + ", status=" + status + ", productDetailsList="
				+ productDetailsList + "]";
	}
	public ProductOneToMany() {
		
	}
}