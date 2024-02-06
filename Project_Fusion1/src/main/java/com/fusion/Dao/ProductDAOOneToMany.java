package com.fusion.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fusion.dto.ProductOneToMany;

public interface ProductDAOOneToMany extends JpaRepository<ProductOneToMany, Integer> {

	
}
