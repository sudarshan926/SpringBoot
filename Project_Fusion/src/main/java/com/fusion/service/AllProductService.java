package com.fusion.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.fusion.Dao.ProductDAO;
import com.fusion.Dao.ProductDetailsDao;
import com.fusion.dto.JointProduct;
import com.fusion.dto.Product;
import com.fusion.dto.ProductDetails;

import jakarta.transaction.Transactional;


@Service
public class AllProductService {

	@Autowired
	ProductDAO dao;

	@Autowired
	ProductDetailsDao dao2;
	
	public ProductDetails AllData(JointProduct j) {

		Product p = new Product();
		p.setStatus(j.getStatus());

		p.setType(j.getType());

		ProductDetails pd = new ProductDetails();
		pd.setName(j.getName());
		pd.setPrice(j.getPrice());
		pd.setManufacture(j.getManufacture());
		pd.setDate(j.getDate());
		
		p.setProductDetails(pd);
		pd.setProduct(p);
		dao2.save(pd);
		dao.save(p);
		return pd;

	}
}
