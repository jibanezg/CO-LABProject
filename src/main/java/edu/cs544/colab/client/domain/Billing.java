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
}
