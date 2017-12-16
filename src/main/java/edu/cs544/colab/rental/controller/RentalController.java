package edu.cs544.colab.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.cs544.colab.rental.service.RentalService;

@Controller
@RequestMapping(name="/rental")
public class RentalController {
	
	@Autowired
	private RentalService rentalService;

	@RequestMapping(name="/isAvailableOffice{id}")
	private boolean isAvailableOffice(@PathVariable int officeId) {
		return rentalService.isAvailableOffice(officeId);
		}
}
