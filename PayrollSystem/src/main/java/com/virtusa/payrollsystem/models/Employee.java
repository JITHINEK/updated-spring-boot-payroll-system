package com.virtusa.payrollsystem.models;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@Column( name="employeId", nullable=false, length=50)
	private int employeId;
	
	@Column( name="employeName")
	private String employeName;
	
	@Column( name="gender")
	private String gender;
	
	@Column( name="dateOfBirth")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dateOfBirth;
	
	@Column( name="email")
	private String email;
	
	@Column( name="mobileNo")
	private long mobileNo;
	
	@Column( name="dateOfJoin")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dateOfJoin;
	
	@Column(name="aadhar")
	private long aadhar;
	
	@Column(name="panCardNo")
	private String panCardNo;
	
	@Column(name="designation")
	private String designation;
	
	@OneToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name="addressId")
	private Address address;
	
	@OneToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name="bankId")
	private BankAccount bankAccount;
	
	@OneToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name="departmentId")
	private Department department;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmployeId() {
		return employeId;
	}
	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}
	public String getEmployeName() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
