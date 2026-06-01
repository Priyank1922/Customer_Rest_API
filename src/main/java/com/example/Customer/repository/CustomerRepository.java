package com.example.Customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
