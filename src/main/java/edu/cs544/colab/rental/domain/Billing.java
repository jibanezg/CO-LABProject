package edu.cs544.colab.rental.domain;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.CreditCardNumber;
@Embeddable
public class Billing{
	@NotNull
	@Future
	private Date expirationDate;
	@NotNull
	private String securityCode;
	private String bankRoutingNumber;
	@NotNull
	@CreditCardNumber
	private String accountNumber;
	
	public Date getDueDate() {
		return expirationDate;
	}
	public void setDueDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getBankRoutingNumber() {
		return bankRoutingNumber;
	}
	public void setBankRoutingNumber(String bankRoutingNumber) {
		this.bankRoutingNumber = bankRoutingNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

}
