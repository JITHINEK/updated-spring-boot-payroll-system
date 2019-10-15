package com.virtusa.payrollsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.payrollsystem.models.Employee;
import com.virtusa.payrollsystem.models.Perfomance;
import com.virtusa.payrollsystem.repositories.PerfomanceRepository;

@Service
public class PerfomanceService {
	
	@Autowired
	private PerfomanceRepository perfomanceRepository;
	
	public Perfomance getPerfomance(Employee employee, int quater, int year) {
		return perfomanceRepository.getPerfomance(employee.getEmployeId(), quater, year);
	}
}
