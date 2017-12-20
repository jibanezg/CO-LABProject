package edu.cs544.colab.rental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cs544.colab.rental.domain.Rental;

@Service
public interface RentalService {
	
	boolean isAvailableOffice(String officeId);
	String addRental(Rental rental);
	//String createbill(Billing bill);
	List<Rental> getRentalList();
}
