package edu.cs544.colab.rental.domain;

import javax.persistence.Embeddable;
import javax.persistence.Enumerated;

import edu.cs544.colab.rental.ContractType;
@Embeddable
public class Contract{
	@Enumerated
	private ContractType type;
	private double securityDeposit;
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
}
