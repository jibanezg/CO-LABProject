package edu.cs544.colab.rental;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
@Entity
public class Contract extends BaseEntity{
	private static final long serialVersionUID = 1L;
	@Enumerated
	private ContractType type;
	private double securityDeposit;
	@OneToOne
	private Rental rental; 
	
	public double getSecurityDeposit() {
		return securityDeposit;
	}
	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}
	public ContractType getType() {
		return type;
	}
	public void setType(ContractType type) {
		this.type = type;
	}
	public Rental getRental() {
		return rental;
	}
	public void setRental(Rental rental) {
		this.rental = rental;
	} 

}
