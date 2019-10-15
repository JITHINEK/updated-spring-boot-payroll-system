package com.virtusa.payrollsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.payrollsystem.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
