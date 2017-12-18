package edu.cs544.colab.client.domain;

import java.util.List;

import edu.cs544.colab.office.domain.Location;
import edu.cs544.colab.office.domain.Office;
import edu.cs544.colab.rental.BaseEntity;
import edu.cs544.colab.rental.domain.Rental;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Client extends BaseEntity {
	
	private String name;
	private Location address;
	private Billing billInfo;
	
	
	@OneToMany // (mappedBy="rental.id")
	private List<Office> rentals;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getAddress() {
		return address;
	}
	public void setAddress(Location address) {
		this.address = address;
	}
	public List<Office> getRentals() {
		return rentals;
	}
	public void setRentals(List<Office> rentals) {
		this.rentals = rentals;
	}
	
	public void addRental(Office rental) {
		this.rentals.add(rental);
	}
	public Billing getBillInfo() {
		return billInfo;
	}
	public void setBillInfo(Billing billInfo) {
		this.billInfo = billInfo;
	}

	
}
