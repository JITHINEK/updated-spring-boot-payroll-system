package com.virtusa.payrollsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.virtusa.payrollsystem.models.Employee;
import com.virtusa.payrollsystem.repositories.EmployeRepository;

@Service
public class EmployeService {

	
	@Autowired
	private EmployeRepository employeRepository;
	
	@Autowired
	private BankAccountService accountService;
	
	@Autowired
	private AddressService addressService;
	
	public Employee getEmployeById(int employeId){
		return employeRepository.findById(employeId).orElse(null);
	}
	
	public Employee updateEmployeDetails(Employee employee) {
		//update bank account details.
		employee.setBankAccount(accountService.editBankAccount(employee.getBankAccount()));
		//update address details.
		employee.setAddress(addressService.editAddress(employee.getAddress()));
		//return employee object after updation.
		return employeRepository.save(employee);
	}
}
