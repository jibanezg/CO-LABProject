package edu.cs544.colab.rental.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import edu.cs544.colab.client.domain.Client;
import edu.cs544.colab.office.domain.Office;
import edu.cs544.colab.rental.BaseEntity;

@Entity
@Component
public class Rental extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@NotNull
	private Date rentFrom;
	@NotNull
	private Date rentTo; 
	@ManyToOne(cascade= {CascadeType.ALL})
	private Client client;
	@Embedded
	private Contract contract;
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private Office office;
	
	/*@OneToMany(mappedBy="rental")
	private List<Bill> bills = new ArrayList<>();*/
	
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
	public void setClient(Client client2) {
		this.client = client2;
	}
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
}
