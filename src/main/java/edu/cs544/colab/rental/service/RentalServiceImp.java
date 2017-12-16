package edu.cs544.colab.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs544.colab.rental.Dao.RentalDao;

@Service
public class RentalServiceImp implements RentalService{
	@Autowired 
	private RentalDao rentalDao;

	public RentalDao getRentalDao() {
		return rentalDao;
	}

	public void setRentalDao(RentalDao rentalDao) {
		this.rentalDao = rentalDao;
	}

}
