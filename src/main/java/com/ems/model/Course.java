package com.ems.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="crsUid", nullable = false, unique=true)
	private long crsUid;
	
	@Column(name="crsName")
	private String crsName;
	
	@Column(name="crsCatg")
	private String crsCatg;
	
	@Column(name="strtDate")
	private String strtDate;
	
	@Column(name="endDate")
	private String endDate;
	
	@Column(name="trainerUid")
	private long trainerUid;
	
	@Column(name="crsType")
	private String crsType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCrsUid() {
		return crsUid;
	}

	public void setCrsUid(long crsUid) {
		this.crsUid = crsUid;
	}

	public String getCrsName() {
		return crsName;
	}

	public void setCrsName(String crsName) {
		this.crsName = crsName;
	}
	

/*	public Date getStrtDate() {
		return strtDate;
	}

	public void setStrtDate(Date strtDate) {
		this.strtDate = strtDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}*/

	public String getCrsCatg() {
		return crsCatg;
	}

	public void setCrsCatg(String crsCatg) {
		this.crsCatg = crsCatg;
	}

	public String getStrtDate() {
		return strtDate;
	}

	public void setStrtDate(String strtDate) {
		this.strtDate = strtDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public long getTrainerUid() {
		return trainerUid;
	}

	public void setTrainerUid(long trainerUid) {
		this.trainerUid = trainerUid;
	}

	public String getCrsType() {
		return crsType;
	}

	public void setCrsType(String crsType) {
		this.crsType = crsType;
	}

	
	
}
