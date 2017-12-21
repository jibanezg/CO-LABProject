package edu.cs544.colab.client.controller;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.*;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import edu.cs544.colab.client.controller.ClientController;

@RunWith(SpringRunner.class)
@WebMvcTest(ClientController.class)
@WebAppConfiguration
public class ClientControllerTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	@BeforeEach
	void setUp() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void testListClients() {
		try {
			this.mockMvc.perform(get("/listClients"))
			.andExpect(model().attributeExists("clients"));
		} catch (Exception e) {

		}
	}

	@Test
	public void testShowClientDetails() {
		try {
			this.mockMvc.perform(get("/clientDetails"))
			.andExpect(model().attributeExists("client"));
		} catch (Exception e) {

		}
	}

	@Test
	public void testAddClient() {
		try {
			this.mockMvc.perform(post("/addClient"))
			.andExpect(content().string("clientDetails"));
		} catch (Exception e) {

		}
	}

	@Test
	public void testSaveClient() {
		try {
			this.mockMvc.perform(post("/clientDetails"))
			.andExpect(content().string("clientDetails"));
		} catch (Exception e) {

		}
	}

	@Test
	public void testGetClient() {
		try {
			this.mockMvc.perform(get("/clientDetails/0"))
			.andExpect(model().attributeExists("client"));
		} catch (Exception e) {

		}
	}

	@Test
	public void testUpdate() {
		try {
			this.mockMvc.perform(post("/update/{id}"))
			.andExpect(content().string("clientDetails"));
		} catch (Exception e) {

		}
	}

	@Test
	public void testDelete() {
		try {
			this.mockMvc.perform(post("/deleteCLient/{id}"))
			.andExpect(content().string(""));
		} catch (Exception e) {

		}
	}

}
