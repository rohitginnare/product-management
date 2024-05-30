package com.exatip.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exatip.product.entity.Address;
import com.exatip.product.service.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController {

	@Autowired
	AddressService addressService;

	@GetMapping("/{id}")
	public ResponseEntity<Address> getAddress(@PathVariable Long id) {
		return new ResponseEntity<Address>(addressService.getAddress(id), HttpStatus.OK);
	}
}
