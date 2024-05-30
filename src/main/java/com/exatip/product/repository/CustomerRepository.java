package com.exatip.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exatip.product.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
