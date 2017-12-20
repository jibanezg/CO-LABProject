package edu.cs544.colab.client.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.cs544.colab.client.dao.ClientDAO;
import edu.cs544.colab.client.domain.Client;

@Service
public class ClientService implements IClientService {
	
	 @Autowired
	    private ClientDAO clientDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addClient(Client client) {
		clientDao.save(client);
	}

	@Override
	public void deleteClient(int clientId) {
		clientDao.deleteById(clientId);

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateClient(Client client) {
		clientDao.save(client);
	}

	@Override
	public Collection<Client> getClients() {
		
		return clientDao.findAll();
	}

	@Override
	public Client getClient(int clientId) {
		return clientDao.findById(clientId);
	}

}
