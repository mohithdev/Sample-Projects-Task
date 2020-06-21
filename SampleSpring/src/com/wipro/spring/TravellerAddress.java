package com.wipro.spring;

public class TravellerAddress {
	String city;
	String state;
	int zipcode;
	
	public TravellerAddress() {
		
	}
	public TravellerAddress(String city, String state, int zipcode) {
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
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
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return " [city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}

}
