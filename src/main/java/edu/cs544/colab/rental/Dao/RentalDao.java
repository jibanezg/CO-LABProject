package edu.cs544.colab.rental.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cs544.colab.rental.BaseEntity;

public interface RentalDao<T extends BaseEntity>extends JpaRepository<T, String>{
	/*Object getObjectById(Object obj,int id);
	List<Object> getObjectsByQuery(String query);*/

}
