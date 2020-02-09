package com.ems.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="education_details")
public class EducationDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="emp_dgree", joinColumns=@JoinColumn(name="id"), inverseJoinColumns=@JoinColumn(name="dgrId"))
	/*@Column(name="dgr_id")
	private long dgr_id;*/
	private Set<Degree> dgree;
	
	@Column(name="dgr_name")
	private String specialization;
	
	@Column(name="institute")
	private String institute;
	
	@Column(name="pass_yr")
	private int pass_yr;
	
	@Column(name="percentage")
	private float percentage;
	
	@Column(name="uid")
	private long uid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Degree> getDgree() {
		return dgree;
	}

	public void setDgree(Set<Degree> dgree) {
		this.dgree = dgree;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public int getPass_yr() {
		return pass_yr;
	}

	public void setPass_yr(int pass_yr) {
		this.pass_yr = pass_yr;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}
	
	
}
