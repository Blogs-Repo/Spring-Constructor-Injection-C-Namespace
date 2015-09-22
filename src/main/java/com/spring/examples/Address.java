package com.spring.examples;

public class Address {
	private int plotNo;
	private String street;
	private String city;
	private String country;

	public Address(int plotNo, String street, String city, String country) {
		super();
		this.plotNo = plotNo;
		this.street = street;
		this.city = city;
		this.country = country;
	}

	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}