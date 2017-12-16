package edu.cs544.colab.rental.Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class RentalDaoImp implements RentalDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public Object getObjectById(Object obj,int id) {
		return sessionFactory.getCurrentSession().get(obj.getClass(), id);
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
