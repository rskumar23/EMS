package com.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Countries {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable = false, unique=true)
	private long id;
	
	@Column(name="cntryName", nullable = false, unique=true)
	private String cntryName;
	
	@Column(name="cntryISO", nullable = false, unique=true)
	private String cntryISO;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCntryName() {
		return cntryName;
	}

	public void setCntryName(String cntryName) {
		this.cntryName = cntryName;
	}

	public String getCntryISO() {
		return cntryISO;
	}

	public void setCntryISO(String cntryISO) {
		this.cntryISO = cntryISO;
	}
	
	
}
