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
	private Long id;
	
	@Column(name="degreeName")
	private String degreeName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	

	
	
	
}
