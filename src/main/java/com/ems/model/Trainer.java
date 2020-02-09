package com.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainer")
public class Trainer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="trainerName")
	private String trainerName;
	
	@Column(name="phno")
	private long phno;
	
	@Column(name="isEmployee")
	private char isEmployee;
	
	@Column(name="address")
	private String address;

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public char getIsEmployee() {
		return isEmployee;
	}

	public void setIsEmployee(char isEmployee) {
		this.isEmployee = isEmployee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	
	
}
