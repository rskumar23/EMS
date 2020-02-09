package com.ems.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leave_category")
public class LeaveCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="category")
	private String category;
	
	@Column(name="leaveCount")
	private float leaveCount;
	
	@Column(name="addedDate")
	private Date addedDate;
	
	@Column(name="addedBy")
	private long addedBy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getLeaveCount() {
		return leaveCount;
	}

	public void setLeaveCount(float leaveCount) {
		this.leaveCount = leaveCount;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public long getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(long addedBy) {
		this.addedBy = addedBy;
	}
	
	

}
