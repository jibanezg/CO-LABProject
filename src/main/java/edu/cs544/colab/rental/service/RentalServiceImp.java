package edu.cs544.colab.rental.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.cs544.colab.client.dao.ClientDAO;
import edu.cs544.colab.office.dao.OfficeDAO;
import edu.cs544.colab.office.domain.Office;
import edu.cs544.colab.office.enums.OfficeStatus;
import edu.cs544.colab.rental.Dao.RentalDao;
import edu.cs544.colab.rental.domain.Rental;

@Service
@Transactional
public class RentalServiceImp implements RentalService{
	@Autowired 
	private RentalDao rentalDao;
	@Autowired
	private ClientDAO clientDAO;
	@Autowired
	private OfficeDAO officeDAO;
	
	
	@Override
	public boolean isAvailableOffice(String officeId) {
		Office office = (Office) officeDAO.getOne(officeId);
		return office.getStatus() == OfficeStatus.FOR_LEASING ? true : false;
	}
	
	@Override
	public String addRental(Rental rental) {
		rentalDao.save(rental);
		return"rentalSuccess";
	}

	/*@Override
	public String createbill(Billing bill) {
		rentalDao.save(bill);
		return "showBill";
	}*/
	
	@Override
	public List<Rental> getRentalList() {
		return rentalDao.findAll();
	}
}
