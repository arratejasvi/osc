package com.osc.models;

public class Address {
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String address_id;
	private String flat_number;
	private String street;
	private String city;
	private String state;
	private String country;
	private String postal_code;
	private Customers customer;
	
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public String getFlat_number() {
		return flat_number;
	}
	public void setFlat_number(String flat_number) {
		this.flat_number = flat_number;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	

	
}
