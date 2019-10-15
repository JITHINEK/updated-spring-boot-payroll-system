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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="salary")
public class Salary {

	@Id
	@Column(name="salaryId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int salaryId;
	
	@Column(name="dateOfReceive")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dateOfReceive;

	@Column(name="basicSalary")
	private int basicSalary;
	
	@Column(name="hra")
	private int hra;
	
	@Column(name="specialAllowance")
	private int specialAllowance;

	@Column(name="foodReimburse")
	private int foodReimburse;
	
	@Column(name="bonus")
	private int bonus;
	
	@Column(name="providentFund")
	private int providentFund;
	
	@Column(name="professionalTax")
	private int professionalTax;
	
	@ManyToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name="employeId")
	private Employee employee;
	
	public int getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}

	public LocalDate getDateOfReceive() {
		return dateOfReceive;
	}

	public void setDateOfReceive(LocalDate dateOfReceive) {
		this.dateOfReceive = dateOfReceive;
	}
	
	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(int specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public int getFoodReimburse() {
		return foodReimburse;
	}

	public void setFoodReimburse(int foodReimburse) {
		this.foodReimburse = foodReimburse;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(int providentFund) {
		this.providentFund = providentFund;
	}

	public int getProfessionalTax() {
		return professionalTax;
	}

	public void setProfessionalTax(int professionalTax) {
		this.professionalTax = professionalTax;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String printSalary() {
		return "Salary [salaryId=" + salaryId + ", dateOfReceive=" + dateOfReceive + ", basicSalary=" + basicSalary
				+ ", hra=" + hra + ", specialAllowance=" + specialAllowance + ", foodReimburse=" + foodReimburse
				+ ", bonus=" + bonus + ", providentFund=" + providentFund + ", professionalTax=" + professionalTax
				+ "]";
	}
	
	

}
