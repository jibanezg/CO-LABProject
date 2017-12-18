package edu.cs544.colab.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

import edu.cs544.colab.rental.domain.Rental;
import edu.cs544.colab.rental.service.RentalService;

@Controller
@EnableWebMvc
//@RequestMapping(name="/rental")
public class RentalController {
	
	@Autowired
	private RentalService rentalService;

	@RequestMapping(name="/isAvailableOffice{id}")
	private boolean isAvailableOffice(@PathVariable String officeId) {
		return rentalService.isAvailableOffice(officeId);
		}
	
	
	@RequestMapping(value="/addRental", method=RequestMethod.POST)
	public String addRental(@RequestBody Rental rental) {
		return rentalService.addRental(rental);
	}
	@RequestMapping("/rental")
	public String map() {
		System.out.println("dsds");
		return "/generic.html";
	}
}
