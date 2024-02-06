package com.fusion.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.fusion.dto.ProductDetails;
@Repository
public interface ProductDetailsDao extends JpaRepository<ProductDetails, Integer> {

}
