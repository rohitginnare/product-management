package com.exatip.product.service;

import com.exatip.product.entity.Customer;

public interface CustomerService {

	public String createCustomer(Customer customer);

	public Customer getCustomer(Long customerId);
}
