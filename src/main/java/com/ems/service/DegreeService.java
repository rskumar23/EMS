package com.ems.service;

import java.util.List;

import com.ems.dto.DegreeDTO;
import com.ems.model.Degree;

public interface DegreeService {

	public void addDegree(DegreeDTO degreeDto);
	public List<Degree> findAll();
	public void deleteDegree(Long degreeId);
	public DegreeDTO updateDegree(Long degreeId);
	
}
