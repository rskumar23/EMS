package com.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_crs_sts")
public class EmployeeCourceStatus {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_crs_id", nullable = false, unique=true)
	private long emp_crs_id;
	
	@Column(name="uid", nullable = false)
	private long uid;
	
	@Column(name="course_id", nullable = false)
	private long courseId;
	
	
	@Column(name="status", nullable = false)
	private String status;

	public long getEmp_crs_id() {
		return emp_crs_id;
	}

	public void setEmp_crs_id(long emp_crs_id) {
		this.emp_crs_id = emp_crs_id;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
