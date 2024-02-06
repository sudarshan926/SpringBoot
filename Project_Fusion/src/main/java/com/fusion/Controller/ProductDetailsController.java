package com.fusion.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fusion.dto.JointProduct;
import com.fusion.dto.ProductDetails;
import com.fusion.service.AllProductService;

@RestController
public class ProductDetailsController {

	public ProductDetailsController() {
		System.out.println("ShowProducts");
	}

	@Autowired
	AllProductService Service;

	
	@PostMapping("/all")
	public ProductDetails showAllProducts(@RequestBody JointProduct j) {
		
		
		
		ProductDetails pde = Service.AllData(j);
		System.out.println("pdea :" + pde);
		return pde;
	}
}
