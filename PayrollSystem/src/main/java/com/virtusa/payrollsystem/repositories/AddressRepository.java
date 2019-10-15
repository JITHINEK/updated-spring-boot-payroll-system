package com.virtusa.payrollsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.payrollsystem.models.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	
}
