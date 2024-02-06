package com.fusion.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.fusion.dto.Product;
import com.fusion.dto.ProductDetails;
import com.fusion.dto.ProductDetailsOneToMany;
@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {

}


 
