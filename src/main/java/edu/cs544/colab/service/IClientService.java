package edu.cs544.colab.service;

import java.util.Collection;

import edu.cs544.colab.client.Client;

public interface IClientService {
	public void addClient(Client client);
	public void deleteClient(String clientId);
	public void updateClient(Client client);
	public Collection<Client> getClients();
	public Client getClient(String clientId);
}
