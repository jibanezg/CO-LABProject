package edu.cs544.colab.rental.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs544.colab.rental.Dao.RentalDao;

@Service
public class RentalServiceImp implements RentalService{
	@Autowired 
	private RentalDao rentalDao;
	
	
	@Override
	public boolean isAvailableOffice(int officeId) {
		//Office office = (Office) rentalDao.getObjectById(Office.class, officeId);
		Date now = new Date();
		List<Object> renList = rentalDao.getObjectsByQuery("FROM Rental r where r.rentTo >= "+now+"AND r.office="+officeId);
		return renList.size()==0 ? true : false;
	}
	
	
	

	public RentalDao getRentalDao() {
		return rentalDao;
	}
	
	public void setRentalDao(RentalDao rentalDao) {
		this.rentalDao = rentalDao;
	}
}
