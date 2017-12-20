package edu.cs544.colab.rental.domain;

import org.springframework.stereotype.Component;
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
	private String bankName;
	private String bankRoutingNumber;
	@NotNull
	@CreditCardNumber
	private String accountNumber;
	
	public Billing() {
		super();
	}
	
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}


	public Date getDueDate() {
		return expirationDate;
	}

	public void setDueDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
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
	
	
}
