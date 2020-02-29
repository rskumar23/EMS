/*package com.ems.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long addrId;
	
	@Column(name="streetAddr")
	private String streetAddr;
	
	@Column(name="pincode")
	private int pincode;
	
	@Column(name="isPermanent")
	private boolean isPermanent;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name="emp_address", joinColumns=@JoinColumn(name="addr_id"), inverseJoinColumns=@JoinColumn(name="uid"))
	private Employee employee;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name="add_country", joinColumns=@JoinColumn(name="addr_id"), inverseJoinColumns=@JoinColumn(name="cntry_id"))
	private Countries countries;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name="add_state", joinColumns=@JoinColumn(name="addr_id"), inverseJoinColumns=@JoinColumn(name="state_id"))
	private States states;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name="add_city", joinColumns=@JoinColumn(name="addr_id"), inverseJoinColumns=@JoinColumn(name="cty_id"))
	private Cities cities;

	public long getAddrId() {
		return addrId;
	}

	public void setAddrId(long addrId) {
		this.addrId = addrId;
	}

	public String getStreetAddr() {
		return streetAddr;
	}

	public void setStreetAddr(String streetAddr) {
		this.streetAddr = streetAddr;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public boolean isPermanent() {
		return isPermanent;
	}

	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Countries getCountries() {
		return countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	public States getStates() {
		return states;
	}

	public void setStates(States states) {
		this.states = states;
	}

	public Cities getCities() {
		return cities;
	}

	public void setCities(Cities cities) {
		this.cities = cities;
	}
	
	
}*/