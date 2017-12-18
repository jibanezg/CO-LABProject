package edu.cs544.colab.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.cs544.colab.rental.domain.Rental;
import edu.cs544.colab.rental.service.RentalService;

@Controller
//@EnableWebMvc
//@RequestMapping(name="/rental")
public class RentalController {
	
	@Autowired
	private RentalService rentalService;
	
	@Autowired
	private Rental rental;

	@RequestMapping(name="/isAvailableOffice{id}")
	private boolean isAvailableOffice(@PathVariable String officeId) {
		return rentalService.isAvailableOffice(officeId);
		}
	
	
	 @PostMapping(value = "/rents", consumes = {MediaType.APPLICATION_JSON_VALUE})
	 public String addRental(@RequestBody Rental rental , BindingResult resul) {
		return rentalService.addRental(rental);
	}
	 
	 @PostMapping(value = "/rents", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	 public void publishOfficeAsFormUrlEncoded(Rental rental , BindingResult result){
	    }
	 
	/*@RequestMapping("/rental")
	public String map() {
		System.out.println("dsds");
		return "/generic.html";
	}*/
	
	@GetMapping(value ="/AddRental")
    public String showRental(ModelAndView model){
        model.addObject(getRental());
        model.setViewName("addRental");
        return "rental";
    }


	public Rental getRental() {
		return rental;
	}


	public void setRental(Rental rental) {
		this.rental = rental;
	}
}
