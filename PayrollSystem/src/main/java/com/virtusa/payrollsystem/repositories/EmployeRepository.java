package com.virtusa.payrollsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.payrollsystem.models.Employee;

public interface EmployeRepository extends JpaRepository<Employee, Integer> {

}
