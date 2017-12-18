package edu.cs544.colab.client.domain;

import java.util.List;

import edu.cs544.colab.rental.BaseEntity;
import edu.cs544.colab.rental.domain.Rental;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Client extends BaseEntity {
	
	String name;
	String address;
	
	@OneToMany // (mappedBy="rental.id")
	List<Rental> rentals;
	
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