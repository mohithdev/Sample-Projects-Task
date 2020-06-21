package com.wipro.spring;

public class TrainBean {
	int trainNo;
	String source;
	String destination;
	String traveller;
	TravellerAddress address;
	
	public TrainBean() {
		System.out.println("----Train obj created----");
	}
	
	//Constructor Injection
	public TrainBean(TravellerAddress adrs) {
		address = adrs;
	}
	
	public TrainBean(int trainNo, String source, String destination,
			String traveller, TravellerAddress address) {
		super();
		this.trainNo = trainNo;
		this.source = source;
		this.destination = destination;
		this.traveller = traveller;
		this.address = address;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTraveller() {
		return traveller;
	}
	//Setter Injection
	public void setTraveller(String traveller) {
		this.traveller = traveller;
	}

	public TravellerAddress getAddress() {
		return address;
	}

	public void setAddress(TravellerAddress address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return " [trainNo=" + trainNo + ", source=" + source
				+ ", destination=" + destination + ", traveller=" + traveller
				+ ", address=" + address + "]";
	}

	public void myInit(){
		System.out.println("---------Bean Initialized--------");
	}
	public void myDestroy(){
		System.out.println("---------Bean Destroyed--------");
	}
	
}
