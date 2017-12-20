package edu.cs544.colab.rental.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cs544.colab.rental.domain.Rental;
@Repository
public interface RentalDao extends JpaRepository<Rental, String>{

}
