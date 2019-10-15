package com.virtusa.payrollsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.payrollsystem.models.Department;
import com.virtusa.payrollsystem.repositories.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department getDepartmentById(Department department) {
		
		return departmentRepository.findById(department.getDepartmentId()).orElse(null);
				
	}
	
}
