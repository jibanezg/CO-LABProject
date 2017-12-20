package edu.cs544.colab.client.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cs544.colab.client.domain.Client;

@Repository
public interface ClientDAO extends JpaRepository<Client,String> {
	
	Client save(Client client);
	
	Client findById(int id);
	
	List<Client> findAll();
	
	void deleteById(int id);

}
