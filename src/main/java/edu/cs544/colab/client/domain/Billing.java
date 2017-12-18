package edu.cs544.colab.client.domain;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import edu.cs544.colab.rental.BaseEntity;

@Embeddable
public class Billing extends BaseEntity {
	
	private String bankName;
	private String bankRoutingNumber;
	private String accountNumber;

}
