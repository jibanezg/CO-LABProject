package edu.cs544.colab.rental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/rental")
public class RentalController {
	/*@RequestMapping("*")
	public void map() {
		System.out.println("dsdsasaf");
		
	}*/
	
	
	@RequestMapping("/addRental")
	public String addRental(@RequestParam int clientId,@RequestParam int officeId) {
		return null;
	}
}
