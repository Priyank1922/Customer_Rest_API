package com.example.Customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Customer.model.Customer;
import com.example.Customer.repository.CustomerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {
	@Autowired
	private CustomerRepository repo;

	public List<Customer> getAll() {
		return repo.findAll();
	}

	public Customer getOne(Long id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
	}

	public Customer create(Customer cus) {
		return repo.save(cus);
	}

	public Customer update(Long id, Customer cus) {
		return repo.findById(id).map((c) -> {
			c.setName(cus.getName());
			c.setEmail(cus.getEmail());
			c.setOrderDish(cus.getOrderDish());

			return repo.save(c);
		}).orElseThrow(() -> new RuntimeException("Not Found"));

	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

}