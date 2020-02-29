package com.ems.dto;

import com.ems.model.Degree;

public class DegreeDTO {
	
	private Long id;
	
	private String degreeName;

	public DegreeDTO() {
		
	}
	public DegreeDTO (Degree degree) {
		this.id = degree.getId();
		this.degreeName = degree.getDegreeName();
	}
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