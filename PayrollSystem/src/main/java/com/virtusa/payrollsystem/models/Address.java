package com.virtusa.payrollsystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {

	@Id
	@Column(name="addressId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	
	@Column( name="doorNo")
	private int doorNo;
	
	@Column( name="StreetName")
    private String streetName;
	
	@Column( name="city")
    private String city;
	
	@Column( name="State")
    private String state;
	
	@Column( name="zipCode")
    private int zipCode;
	
	@Column( name="country")
	private String Country;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	
}
