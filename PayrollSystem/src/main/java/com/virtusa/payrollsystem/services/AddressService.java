package com.virtusa.payrollsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.payrollsystem.models.Address;
import com.virtusa.payrollsystem.repositories.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public Address editAddress(Address address) {
		return addressRepository.save(address);
	}

}
