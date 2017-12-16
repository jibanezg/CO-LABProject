package edu.cs544.colab.rental.service;

import org.springframework.stereotype.Service;

@Service
public interface RentalService {
	
	boolean isAvailableOffice(int officeId);
}
