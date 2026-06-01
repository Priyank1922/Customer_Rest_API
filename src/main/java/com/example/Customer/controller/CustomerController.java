package com.example.Customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customer.model.Customer;
import com.example.Customer.service.CustomerService;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {
	@Autowired

	public CustomerService service;

	@GetMapping
	public List<Customer> getAll() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Customer getOne(@PathVariable Long id) {
		return service.getOne(id);
	}

	@PostMapping
	public Customer createCustomer(@RequestBody Customer cus) {
		return service.create(cus);
	}

	@PutMapping("/{id}")
	public Customer updateOne(@PathVariable Long id, @RequestBody Customer cus) {
		return service.update(id, cus);
	}

	@DeleteMapping("/{id}")
	public String deleteOne(@PathVariable Long id) {
		service.delete(id);
		return "Delete Successfully";

	}

}
