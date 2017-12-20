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
		if(ContractType.DAILY == type)
			setSecurityDeposit(20);
		if(ContractType.MONTHLY == type)
			setSecurityDeposit(50);
		if(ContractType.YEARLY == type)
			setSecurityDeposit(80);
	}
}
