package edu.cs544.colab.client;

import java.util.List;

public class Client {
	
	String clientId;
	String name;
	String address;
	List<Rental> rentals;
	
	public String getClientId() {
		return clientId;
	}
	
	public void setClientId(String id) {
		this.clientId = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Rental> getRentals() {
		return rentals;
	}
	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}
	
	public void addRental(Rental rental) {
		this.rentals.add(rental);
	}

}
