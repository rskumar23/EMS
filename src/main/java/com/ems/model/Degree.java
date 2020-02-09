package com.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="degree")
public class Degree {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dgrId", nullable = false, unique=true)
	private long id;
	
	@Column(name="dgrName")
	private String dgrName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDgrName() {
		return dgrName;
	}

	public void setDgrName(String dgrName) {
		this.dgrName = dgrName;
	}

	
	
	
}
