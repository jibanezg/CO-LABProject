package edu.cs544.colab.client.domain;

import org.springframework.stereotype.Component;

import edu.cs544.colab.rental.BaseEntity;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Billing {
	private static final long serialVersionUID = 1L;
	
	private double amount = 0d;
	private Date dueDate;
	private String bankName;
	private String bankRoutingNumber;
	private String accountNumber;

	public Billing() {
		super();
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
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
