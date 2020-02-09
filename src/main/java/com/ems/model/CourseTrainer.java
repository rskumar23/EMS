package com.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="crsTrainer")
public class CourseTrainer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable = false, unique=true)
	private long id;
	
	@Column(name="crsId", nullable = false, unique=true)
	private long crsId;
	
	@Column(name="trainerId", nullable = false, unique=true)
	private long trainerId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCrsId() {
		return crsId;
	}

	public void setCrsId(long crsId) {
		this.crsId = crsId;
	}

	public long getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(long trainerId) {
		this.trainerId = trainerId;
	}



}
