package com.fusion.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.fusion.dto.ProductDetails;
import com.fusion.dto.ProductDetailsOneToMany;
@Repository
public interface ProductDetailsDao extends JpaRepository<ProductDetails, Integer> {

}

interface ProductDetailsDaoOneToMany extends JpaRepository<ProductDetailsOneToMany, Integer> {

}
