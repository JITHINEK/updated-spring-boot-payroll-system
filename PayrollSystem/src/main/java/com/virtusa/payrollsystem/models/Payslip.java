package com.virtusa.payrollsystem.models;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="payslip")
public class Payslip {

	@Id
	@Column(name="payslipId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int payslipId;
	
	@Column(name="dateOfGeneration")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dateOfGeneration;
	
	@OneToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name="salaryId")
	private Salary salary;
	
	public int getPayslipId() {
		return payslipId;
	}

	public void setPayslipId(int payslipId) {
		this.payslipId = payslipId;
	}

	public LocalDate getDateOfGeneration() {
		return dateOfGeneration;
	}

	public void setDateOfGeneration(LocalDate dateOfGeneration) {
		this.dateOfGeneration = dateOfGeneration;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public String printPayslip() {
		return "Payslip [payslipId=" + payslipId + ", dateOfGeneration=" + dateOfGeneration
				+ "]";
	}
	

	
}
