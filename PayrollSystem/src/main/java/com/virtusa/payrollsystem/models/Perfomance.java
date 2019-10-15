package com.virtusa.payrollsystem.models;

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

@Entity
@Table(name="perfomance")
public class Perfomance {

	@Id
	@Column(name="perfomanceId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int perfomanceId;
	
	@Column(name="rating")
	private float rating;
	
	@Column(name="quater")
	private int quater;
	
	@Column(name="year")
	private int year;
	
	@ManyToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name="employeId")
	private Employee employee;

	public int getPerfomanceId() {
		return perfomanceId;
	}

	public void setPerfomanceId(int perfomanceId) {
		this.perfomanceId = perfomanceId;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getQuater() {
		return quater;
	}

	public void setQuater(int quater) {
		this.quater = quater;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
