package com.briup.pojo;

public class Address {
	private Integer addrId;
	private String street;
	private String city;
	private String country;
	public Integer getAddrId() {
		return addrId;
	}
	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
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
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", street=" + street + ", city="
				+ city + ", country=" + country + "]";
	}
	public Address(Integer addrId, String street, String city, String country) {
		this.addrId = addrId;
		this.street = street;
		this.city = city;
		this.country = country;
	}
	public Address(String street, String city, String country) {
		this.street = street;
		this.city = city;
		this.country = country;
	}
	public Address() {
	}
	
	
}
