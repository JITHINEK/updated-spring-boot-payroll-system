package com.virtusa.payrollsystem.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.payrollsystem.models.Salary;
import com.virtusa.payrollsystem.repositories.SalaryRepository;

@Service
public class SalaryService {
	
	@Autowired
	private SalaryRepository salaryRepository;
	
	public Salary getSalary(int employeId, LocalDate dateOfReceive) {
		return salaryRepository.getSalary(employeId, dateOfReceive);
	}
}
