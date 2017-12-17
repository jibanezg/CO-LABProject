package edu.cs544.colab.rental.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

// @Repository
public interface RentalDao {
	Object getObjectById(Object obj,int id);
	List<Object> getObjectsByQuery(String query);

}
