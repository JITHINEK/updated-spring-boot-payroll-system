package com.virtusa.payrollsystem.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.virtusa.payrollsystem.models.Payslip;

@Transactional
public interface PayslipRepository extends JpaRepository<Payslip, Integer> {
	
	@Query("SELECT payslip FROM Payslip payslip WHERE payslip.salary.salaryId = :id")
	Payslip getPayslip(@Param("id") int salaryId);
}
