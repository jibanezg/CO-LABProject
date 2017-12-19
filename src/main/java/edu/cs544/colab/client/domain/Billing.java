package edu.cs544.colab.client.domain;

import java.util.Date;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import edu.cs544.colab.rental.BaseEntity;
@Entity
@Component
public class Billing extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	private double amount = 0d;
	private Date dueDate;
	private String bankName;
	private String bankRoutingNumber;
	private String accountNumber;

}
