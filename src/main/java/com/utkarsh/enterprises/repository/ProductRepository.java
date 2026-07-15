package com.utkarsh.enterprises.repository;

import com.utkarsh.enterprises.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}