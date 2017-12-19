package edu.cs544.colab.rental.service;

import org.springframework.stereotype.Service;

import edu.cs544.colab.client.domain.Billing;
import edu.cs544.colab.rental.domain.Rental;

@Service
public interface RentalService {
	
	boolean isAvailableOffice(String officeId);
	String addRental(Rental rental);
	
	String createbill(Billing bill);
}
