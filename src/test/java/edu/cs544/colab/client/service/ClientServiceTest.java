package edu.cs544.colab.client.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.cs544.colab.client.domain.Client;
import edu.cs544.colab.office.domain.Location;
import edu.cs544.colab.rental.domain.Billing;

class ClientServiceTest {
	
	private Client client;
	private ClientService clientService;


	@BeforeEach
	void setUp() throws Exception {
		client = new Client();
		client.setName("Test Foo");
		client.getAddress().setStreet("123 East Main");
		client.getAddress().setCity("River City");
		client.getAddress().setState("IA");
		client.getAddress().setZipCode("55678");
		client.getBillInfo().setBankName("Freestar");
		clientService = new ClientService();
		}

	@Test
	void testAddClient() {
		// Arrange
		clientService.addClient(client);
		// Act
		Client retClient = clientService.getClient(client.getId());
		// Assert
		Assert.assertEquals("Test Foo", retClient.getName());
	}
	
	@Test
	void testUpdateClient() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteClient() {
		// Arrange
		clientService.deleteClient(client.getId());
		// Act
		Client retClient = clientService.getClient(client.getId());
		// Assert
		Assert.assertEquals(null, retClient);
	}

	@Test
	void testGetClients() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClient() {
		fail("Not yet implemented");
	}

}
