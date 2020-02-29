package com.ems.dto;

import javax.persistence.Column;

import com.ems.model.Course;

import ch.qos.logback.core.CoreConstants;

public class CourseDTO {
	
	private Long Id;
	
	private long crsUid;
	
	private String name;
	
	private String category;
	
	private String strtDate;
	
	private String endDate;
	
	private long trainerUid;
	
	private String type;
	
	 public CourseDTO() {
		
	}
	 
	 public CourseDTO(Course course) {
		 
		 this.Id = course.getId();
		 this.category = course.getCategory();
		 this.crsUid = course.getCrsUid();
		 this.name = course.getName();
		 this.strtDate = course.getStrtDate();
		 this.endDate = course.getEndDate();
		 this.trainerUid = course.getTrainerUid();
		 this.type = course.getType();
		 
	 }

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
