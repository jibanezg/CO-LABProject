package edu.cs544.colab.client.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientTest {

	private Client client;
	
	@BeforeEach
	void setUp() throws Exception {
		client = new Client();
	}

	@Test
	void testSetAndGetName() {
		// Arrange
		client.setName("Test Foo");
		// Act
		String retName = client.getName();
		// Assert
		Assert.assertEquals("Test Foo", retName);
	}

}
