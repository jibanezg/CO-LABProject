package edu.cs544.colab.rental.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import edu.cs544.colab.client.Client;
import edu.cs544.colab.rental.BaseEntity;

@Entity
public class Rental extends BaseEntity{
	private static final long serialVersionUID = 1L;
	private Date rentFrom;
	private Date rentTo; 
	@ManyToOne
	private Client client;
	@OneToOne
	private Contract contract;
	@ManyToOne
	private Office office;
	
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
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
}
