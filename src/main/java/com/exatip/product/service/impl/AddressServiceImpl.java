package com.exatip.product.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exatip.product.entity.Address;
import com.exatip.product.repository.AddressRepository;
import com.exatip.product.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	private static final Logger log = LoggerFactory.getLogger(AddressServiceImpl.class);

	@Autowired
	AddressRepository addressRepository;

	@Override
	public Address getAddress(Long id) {
		log.info("Inside AddressServiceImpl getAddress method.");
		Optional<Address> address = addressRepository.findById(id);

		Address address1 = null;
		if (address.isPresent()) {
			address1 = address.get();
		}

		log.info("Exit AddressServiceImpl getAddress method.");
		return address1;
	}

}
