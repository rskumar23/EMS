package com.ems.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="timesheet")
public class TimeSheet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ts_id", nullable = false, unique=true)
	private long ts_id;
	
	@Column(name="ts_date")
	private Date ts_date;
	
	@Column(name="hrs")
	private int hrs;
	
	@Column(name="uid")
	private long uid;

	public long getTs_id() {
		return ts_id;
	}

	public void setTs_id(long ts_id) {
		this.ts_id = ts_id;
	}

	public Date getTs_date() {
		return ts_date;
	}

	public void setTs_date(Date ts_date) {
		this.ts_date = ts_date;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}
	
	

}
