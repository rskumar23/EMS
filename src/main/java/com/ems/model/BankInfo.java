package com.ems.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bankinfo")
public class BankInfo {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable = false, unique=true)
	private long id;
	
	@Column(name="bankName", nullable = false)
	private String bankName;
	
	@Column(name="accNo", nullable = false, unique=true)
	private long accNo;
	
	@Column(name="ifsc", nullable = false)
	private String ifsc;
	
	@Column(name="branch", nullable = false)
	private String branch;
	
	@Column(name="city")
	private String city;
	
	@Column(name="pincode")
	private int pincode;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="emp_bank", joinColumns=@JoinColumn(name="id"), inverseJoinColumns=@JoinColumn(name="uid"))
	private Employee employee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
