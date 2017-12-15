package edu.cs544.colab.rental;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private Date creationDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
