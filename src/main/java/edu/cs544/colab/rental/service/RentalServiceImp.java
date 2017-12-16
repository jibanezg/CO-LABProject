package edu.cs544.colab.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs544.colab.rental.Dao.RentalDao;
import edu.cs544.colab.rental.domain.Rental;

@Service
public class RentalServiceImp implements RentalService{
	@Autowired 
	private RentalDao rentalDao;
	
	
	@Override
	public boolean checkOffice(int officeId) {
		Office office = rentalDao.getObjectById(Office.class, officeId);
		
		 false;
	}
	
	
	

	public RentalDao getRentalDao() {
		return rentalDao;
	}
	
	public void setRentalDao(RentalDao rentalDao) {
		this.rentalDao = rentalDao;
	}
}
