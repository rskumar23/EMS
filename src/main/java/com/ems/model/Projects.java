package com.ems.model;

import java.sql.Date;

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
@Table(name="projects")
public class Projects {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="prj_id", nullable = false, unique=true)
	private long id;
	
	@Column(name="prjwon", nullable = false, unique=true)
	private long won;
	
	@Column(name="prjName")
	private String prjName;
	
	@Column(name="prjSatrtDate")
	private Date prjSatrtDate;
	
	@Column(name="prjEndDate")
	private Date prjEndDate;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="emp_project", joinColumns=@JoinColumn(name="won"), inverseJoinColumns=@JoinColumn(name="uid"))
	private Employee employee;
	
	@Column(name="clientName")
	private String clientName;
	
	@Column(name="prjDomain")
	private String prjDomain;
	
	@Column(name="status")
	private String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getWon() {
		return won;
	}

	public void setWon(long won) {
		this.won = won;
	}

	public String getPrjName() {
		return prjName;
	}

	public void setPrjName(String prjName) {
		this.prjName = prjName;
	}

	public Date getPrjSatrtDate() {
		return prjSatrtDate;
	}

	public void setPrjSatrtDate(Date prjSatrtDate) {
		this.prjSatrtDate = prjSatrtDate;
	}

	public Date getPrjEndDate() {
		return prjEndDate;
	}

	public void setPrjEndDate(Date prjEndDate) {
		this.prjEndDate = prjEndDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getPrjDomain() {
		return prjDomain;
	}

	public void setPrjDomain(String prjDomain) {
		this.prjDomain = prjDomain;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
