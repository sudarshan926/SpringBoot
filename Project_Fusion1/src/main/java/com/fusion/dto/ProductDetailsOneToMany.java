package com.fusion.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table
public class ProductDetailsOneToMany {

	@Id
	@Column
	@GeneratedValue
	private int id;
	private String name;
	private double price;
	private String Manufacture;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManufacture() {
		return Manufacture;
	}

	public void setManufacture(String manufacture) {
		Manufacture = manufacture;
	}

	

	public ProductDetailsOneToMany(int id, String name, double price, String manufacture) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		Manufacture = manufacture;
		
	}
	
	public ProductDetailsOneToMany() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", name=" + name + ", price=" + price + ", Manufacture=" + Manufacture+ "]";
	}
	
	
	
}
