package edu.cs544.colab.rental.Dao;

import org.springframework.stereotype.Repository;

@Repository
public interface RentalDao {
	Object getObjectById(Object obj,int id);

}
