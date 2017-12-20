package edu.cs544.colab.client.domain;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
@Embeddable
public class Billing{
	@NotNull
	private Date dueDate;
	@NotNull
	private String securityCode;
	private String bankRoutingNumber;
	@NotNull
	private String accountNumber;
	
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
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
