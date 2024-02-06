package com.fusion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.fusion.Dao.ProductDAO;
import com.fusion.Dao.ProductDAOOneToMany;
import com.fusion.Dao.ProductDetailsDao;
import com.fusion.dto.Product;
import com.fusion.dto.ProductDetails;
import com.fusion.dto.ProductOneToMany;

@Service
public class ProductService {

	@Autowired
	ProductDAO productDAO;
	@Autowired
	ProductDAOOneToMany ProductDAOOneToMany;

	public ProductService() {
		System.out.println("Inside ProductService");
	}
	public List<Product> ProductService1(List<Product> p) {
		System.out.println("Inside ProductDetailsService1");
		List<Product> p1 = productDAO.saveAll(p);
		return p1;
	}
	public List<ProductOneToMany> ProductOneToManyService(List<ProductOneToMany> O) {
		List<ProductOneToMany> p2 = ProductDAOOneToMany.saveAll(O);
		return p2;
	}

}
