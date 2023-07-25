package com.javatechie.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.javatechie.crud.example.entity.Product;

@Component
public interface ProductRepository extends JpaRepository<Product, Integer> {
	Product findByName(String name);
}
