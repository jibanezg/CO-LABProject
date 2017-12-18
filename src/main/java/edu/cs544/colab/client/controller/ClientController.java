package edu.cs544.colab.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.cs544.colab.client.domain.Client;
import edu.cs544.colab.client.service.IClientService;

@Controller
public class ClientController {

	@Autowired
	private IClientService clientService;
	
	@Autowired
    private Client client;
	
	@GetMapping(value = "/clientDetails")
	public ModelAndView showClientDetails(ModelAndView model) {
        model.addObject(client);
        model.setViewName("clientDetails");
        return model;
	}
}
