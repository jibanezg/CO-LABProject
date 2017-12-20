package edu.cs544.colab.client.service;

import java.util.Collection;

import edu.cs544.colab.client.domain.Client;

public interface IClientService {
	public void addClient(Client client);
	public void deleteClient(int clientId);
	public void updateClient(Client client);
	public Collection<Client> getClients();
	public Client getClient(int clientId);
}
