package edu.cs544.colab.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@GetMapping(value = "/addClient")
	public ModelAndView addClient(ModelAndView model) {
		model.addObject(client);
		model.setViewName("addClient");
		return model;
	}
	
	@PostMapping(value = "/addClient")
	public String saveClient(Client client, BindingResult result) {
		clientService.addClient(client);
		return "clientDetails";
	}
	
	@GetMapping(value="/clientDetails/{id}")
	public String getClient(@PathVariable String id, ModelAndView model) {
		client = clientService.getClient(id);
		model.addObject(client);
		return "clientDetails";
	}
	
	@PostMapping(value="/update/{id}")
	public String update(Client client, @PathVariable String id) {
		client = clientService.getClient(id);
		clientService.updateClient(client);
		return "clientDetails";
	}
	
	@RequestMapping(value="/deleteCLient/{id}", method=RequestMethod.POST)
	public String delete(@PathVariable int id) {
		clientService.deleteClient(id);
		return "";
	}
}
