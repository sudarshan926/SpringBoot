package com.fusion.Controller;
import com.fusion.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fusion.dto.Product;
import com.fusion.dto.ProductOneToMany;

@RestController
public class ProductController {

	@Autowired
	ProductService ProductService;
	
	
	public ProductController() {
		System.out.println("Inside ProductController");
	}
	
	@PostMapping("/onetoone")
	public List<Product> ProductController1(@RequestBody List<Product>p ) {
		System.out.println("Inside ProductController1 ");
		System.out.println("Inside ProductController1.ProductController");
		List<Product> p3=ProductService.ProductService1(p);
		return p3;
	}
	
	
	@PostMapping("/manytomany")
	public List<ProductOneToMany> ProductControllerOneToMany(@RequestBody List<ProductOneToMany> p ) {
		System.out.println("Inside ProductControllerOneToMany.ProductController");
		return ProductService.ProductOneToManyService(p);
		
	}
	
}
