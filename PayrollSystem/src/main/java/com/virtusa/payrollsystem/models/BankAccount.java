package com.virtusa.payrollsystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bank")
public class BankAccount {
	
	@Id
	@Column(name="bankId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bankId;
	
	@Column(name="Bank_Name")
	private String bankName;
	
	@Column(name="Acc_No")
	private long accNo;
	
	@Column(name="Ifsc_Code")
	private String ifscCode;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}	
	
}
