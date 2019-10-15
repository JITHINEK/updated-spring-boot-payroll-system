package com.virtusa.payrollsystem.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.payrollsystem.models.Employee;
import com.virtusa.payrollsystem.models.Payslip;
import com.virtusa.payrollsystem.repositories.PayslipRepository;

@Service
public class PayslipService {
	
	@Autowired
	private PayslipRepository payslipRepository;
	
	@Autowired
	private SalaryService salaryService;
	
	public Payslip getPaySlip(Employee employee , LocalDate dateOfReceive) {
		return payslipRepository.getPayslip(salaryService.getSalary(employee.getEmployeId(), dateOfReceive).getSalaryId());
	}
}
