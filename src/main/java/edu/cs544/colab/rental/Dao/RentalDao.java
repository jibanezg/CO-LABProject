package edu.cs544.colab.rental.Dao;

import java.util.List;

public interface RentalDao {
	Object getObjectById(Object obj,int id);
	List<Object> getObjectsByQuery(String query);

}
