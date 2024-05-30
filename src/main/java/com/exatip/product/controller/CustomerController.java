package com.exatip.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exatip.product.entity.Customer;
import com.exatip.product.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/{customerId}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Long customerId) {
		return new ResponseEntity<Customer>(customerService.getCustomer(customerId), HttpStatus.OK);
	}

	@PostMapping("")
	public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<String>(customerService.createCustomer(customer), HttpStatus.OK);
	}

}
