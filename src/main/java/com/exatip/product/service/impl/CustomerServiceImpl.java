package com.exatip.product.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exatip.product.entity.Customer;
import com.exatip.product.repository.CustomerRepository;
import com.exatip.product.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public String createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);

		return "Customer Saved successfully";
	}

	@Override
	public Customer getCustomer(Long customerId) {
		log.info("Inside getCustomer method of CustomerServiceImpl");
		customerRepository.findById(customerId);

		Customer customer = null;
		if (customerRepository.findById(customerId).isPresent()) {
			customer = customerRepository.findById(customerId).get();
		}

		log.info("Exit getCustomer method of CustomerServiceImpl");
		return customer;
	}

}
