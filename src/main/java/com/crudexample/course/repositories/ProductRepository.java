package com.crudexample.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudexample.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
