package com.virtusa.payrollsystem.repositories;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.virtusa.payrollsystem.models.Salary;

@Transactional
public interface SalaryRepository extends JpaRepository<Salary, Integer> {	
	
	@Query("SELECT sal FROM Salary sal WHERE sal.employee.employeId = :id and sal.dateOfReceive = :dor")
	Salary getSalary(@Param("id") int employeId, @Param("dor") LocalDate dateOfReceive);
	
}
