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
	private Long Id;
	
	@Column(name="crsUid", nullable = false, unique=true)
	private long crsUid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="category")
	private String category;
	
	@Column(name="strtDate")
	private String strtDate;
	
	@Column(name="endDate")
	private String endDate;
	
	@Column(name="trainerUid")
	private long trainerUid;
	
	@Column(name="type")
	private String type;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public long getCrsUid() {
		return crsUid;
	}

	public void setCrsUid(long crsUid) {
		this.crsUid = crsUid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}