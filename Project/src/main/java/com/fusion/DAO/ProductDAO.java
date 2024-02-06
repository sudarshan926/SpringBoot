package com.fusion.DAO;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.fusion.dto.Product;
import com.fusion.dto.ProductDetails;
@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {

}


 
