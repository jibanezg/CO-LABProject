package edu.cs544.colab.rental.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.cs544.colab.client.domain.Billing;
import edu.cs544.colab.office.domain.Office;
import edu.cs544.colab.rental.domain.Rental;
import edu.cs544.colab.rental.service.RentalService;

@Controller
public class RentalController {
	
	@Autowired
	private RentalService rentalService;
	@Autowired
	private Rental rental;
	
	@Autowired
	private Office office;
	
	@Autowired
	private static Billing bill = new Billing();
	
	private double total = 0d;
	
	@RequestMapping(name="/isAvailableOffice{id}")
	private boolean isAvailableOffice(@PathVariable String officeId) {
		return rentalService.isAvailableOffice(officeId);
		}
	
	 @PostMapping(value = "/rents" , consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	 public String addRental(@NotNull @Valid Rental rental , BindingResult result){
		 rental.setOffice(office);
		 return rentalService.addRental(rental);
	    }
	 
	@GetMapping(value ="/addRental")
    public String showRental(Model model){
		Rental rental = new Rental();
        model.addAttribute("rental", rental);
        return "addRental";
    }
	
	@GetMapping(value="/toRent/{officeId}")
	    public ModelAndView add(@PathVariable("officeId") String officeId,ModelAndView model) {
		office = rentalService.getOfficeById(officeId);
		model.addObject(rental);
		model.setViewName("addRental");
		return model;
	 }
	
	/*@PostMapping(value = "/createBill", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public ModelAndView createBill(Billing bill ,BindingResult result ,ModelAndView model) {
		model.setViewName("showBill");
		model.addObject("bill",new Billing());
		 //rentalService.createbill(bill);
		 return model;*/
		 
		 
		 @PostMapping(value = "/createBill", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
		 public String createBill(Billing bill, BindingResult result ,ModelAndView model){
			 model.setViewName("showBill");
			 model.addObject("bill",new Billing());
			 return rentalService.createbill(bill);
		    }
		 
		 
	/*public void calculateTotal() {
	    long monthsInYear = ChronoUnit.MONTHS.between(LocalDate.now(rental.getRentFrom().getTime()), rental.getRentTo());
	    total = monthsInYear*office.getPrice();
	}*/
	
	
    public static ModelAndView method(ModelAndView model){
        model.addObject(bill);
        model.setViewName("rentalSuccess");
        return model;
    }
}
