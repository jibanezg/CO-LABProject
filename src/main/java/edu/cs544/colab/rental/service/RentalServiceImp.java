package edu.cs544.colab.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs544.colab.client.dao.ClientDAO;
import edu.cs544.colab.office.dao.OfficeDAO;
import edu.cs544.colab.office.domain.Office;
import edu.cs544.colab.office.enums.OfficeStatus;
import edu.cs544.colab.rental.Dao.RentalDao;
import edu.cs544.colab.rental.domain.Rental;

@Service
public class RentalServiceImp implements RentalService{
	@Autowired 
	private RentalDao rentalDao;
	@Autowired
	private ClientDAO clientDAO;
	@Autowired
	private OfficeDAO officeDAO;
	
	
	@Override
	public boolean isAvailableOffice(String officeId) {
		Office office = officeDAO.getOne(officeId);
		return office.getStatus() == OfficeStatus.FOR_LEASING ? true : false;
	}
	
	
	

	public RentalDao getRentalDao() {
		return rentalDao;
	}
	
	public void setRentalDao(RentalDao rentalDao) {
		this.rentalDao = rentalDao;
	}

	@Override
	public String addRental(Rental rental) {
		if(!isAvailableOffice(rental.getOffice().getId()))
			return "THIS OFFICE IN NOT AVALIABLE NOW";
		rentalDao.save(rental);
		return"SUCCESS PROCESS";
	}
}
