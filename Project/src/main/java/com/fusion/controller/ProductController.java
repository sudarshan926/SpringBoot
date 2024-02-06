package com.fusion.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fusion.dto.Product;
import com.fusion.service.ProductService;

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
	
	 @GetMapping("/writeToExcel")
	   public ResponseEntity<String> writeDataToExcel() {
	        ProductService.writeDataToExcel();
	        return ResponseEntity.ok("Data written to Excel file successfully.");
	    }
	
}
