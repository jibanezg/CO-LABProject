package edu.cs544.colab.rental.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cs544.colab.rental.domain.Rental;

public interface RentalDao extends JpaRepository<Rental, String>{
	/*Object getObjectById(Object obj,int id);
	List<Object> getObjectsByQuery(String query);*/

}
