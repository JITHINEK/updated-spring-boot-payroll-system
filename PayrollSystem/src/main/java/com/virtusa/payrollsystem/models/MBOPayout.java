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

@Entity
@Table(name="mboPayout")
public class MBOPayout {

	@Id
	@Column(name="mboPayoutId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mboPayoutId;

	@OneToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name="perfomanceId")
	private Perfomance perfomance;

	@Column(name="dateOReceive")
	private LocalDate dateOfReceive;
	
	@Column(name="amount")
	private float amount;
	
	public int getMboPayoutId() {
		return mboPayoutId;
	}

	public void setMboPayoutId(int mboPayoutId) {
		this.mboPayoutId = mboPayoutId;
	}

	public LocalDate getDateOfReceive() {
		return dateOfReceive;
	}

	public void setDateOfReceive(LocalDate dateOfReceive) {
		this.dateOfReceive = dateOfReceive;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Perfomance getPerfomance() {
		return perfomance;
	}

	public void setPerfomance(Perfomance perfomance) {
		this.perfomance = perfomance;
	}	
}
