package edu.cs544.colab.rental;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import edu.cs544.colab.client.Client;

@Entity
public class Rental extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private Date rentFrom;
	private Date rentTo; 
	@OneToOne
	private Client client;
	
	
	public Date getRentFrom() {
		return rentFrom;
	}
	public void setRentFrom(Date rentFrom) {
		this.rentFrom = rentFrom;
	}
	public Date getRentTo() {
		return rentTo;
	}
	public void setRentTo(Date rentTo) {
		this.rentTo = rentTo;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
}
