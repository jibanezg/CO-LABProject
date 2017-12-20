package edu.cs544.colab.rental.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.cs544.colab.office.domain.Office;
import edu.cs544.colab.office.service.IOfficeService;
import edu.cs544.colab.rental.ContractType;
import edu.cs544.colab.rental.domain.Rental;
import edu.cs544.colab.rental.service.RentalService;

@Controller
public class RentalController {
	
	@Autowired
	private RentalService rentalService;
	
	@Autowired
	private IOfficeService officeService;
	@Autowired
	private Rental rental;
	
	@Autowired
	private Office office;
	
	@RequestMapping(name="/isAvailableOffice{id}")
	private boolean isAvailableOffice(@PathVariable String officeId) {
		return rentalService.isAvailableOffice(officeId);
		}
	
	 @PostMapping(value = "/rents" , consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	 public String addRental(@NotNull @Valid Rental rental , BindingResult result, Model model){
		 rental.setOffice(office);
		 model.addAttribute("total",calculateTotal(rental));
		 return rentalService.addRental(rental);
	    }
	 
	@GetMapping(value ="/addRental")
    public String showRental(Model model){
		Rental rental = new Rental();
        model.addAttribute("rental", rental);
        //model.addAttribute("bill",bill);
        return "addRental";
    }
	
	@GetMapping(value="/toRent/{officeId}")
	    public ModelAndView add(@PathVariable("officeId") String officeId,ModelAndView model) {
		office = officeService.findOfficeById(officeId);
		model.addObject(rental);
		model.setViewName("addRental");
		return model;
	 }
	
		 
	 @GetMapping(value = "/ListRental")
	 @PreAuthorize("hasAuthority('ADMIN')")
	    public ModelAndView showRentalListView(ModelAndView model){
	        model.addObject("listRental",rentalService.getRentalList());
	        model.setViewName("rentalList");
	        return model;
	    }
	 
	public double calculateTotal(Rental rental) {
		if(rental.getContract().getType()!=ContractType.DAILY) {
		Calendar startCalendar = new GregorianCalendar();
		startCalendar.setTime(rental.getRentFrom());
		Calendar endCalendar = new GregorianCalendar();
		endCalendar.setTime(rental.getRentTo());

		int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
		int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
	    return diffMonth*office.getPrice();}
		else
			return office.getPrice()/30;
		
	}
}
