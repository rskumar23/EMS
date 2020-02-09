package com.ems.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="holidays")
public class Holidays {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="hld_id", nullable = false, unique=true)
	private long hld_id;
	
	@Column(name="hld_title")
	private String hld_title;
	
	@Column(name="hld_date", nullable = false)
	private Date hld_date;

	public long getHld_id() {
		return hld_id;
	}

	public void setHld_id(long hld_id) {
		this.hld_id = hld_id;
	}

	public String getHld_title() {
		return hld_title;
	}

	public void setHld_title(String hld_title) {
		this.hld_title = hld_title;
	}

	public Date getHld_date() {
		return hld_date;
	}

	public void setHld_date(Date hld_date) {
		this.hld_date = hld_date;
	}

}
