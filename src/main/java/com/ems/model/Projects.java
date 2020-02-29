package com.ems.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="projects")
public class Projects {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id;
	
	@Column(name="projectUid", nullable = false, unique=true)
	private long projectUid;
	
	private String name;
	
	private Date startDate;
	
	private Date endDate;
	
	private float duration;
	
	@OneToMany(mappedBy = "projects")
	private List<Employee> employee;
	
	private String clientName;
	
	private String projectDomain;
	
	private String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public long getProjectUid() {
		return projectUid;
	}

	public void setProjectUid(long projectUid) {
		this.projectUid = projectUid;
	}

	public String getProjectDomain() {
		return projectDomain;
	}

	public void setProjectDomain(String projectDomain) {
		this.projectDomain = projectDomain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	
	
}
