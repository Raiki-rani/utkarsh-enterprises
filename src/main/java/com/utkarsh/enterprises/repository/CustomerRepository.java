package com.utkarsh.enterprises.repository;

import com.utkarsh.enterprises.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}