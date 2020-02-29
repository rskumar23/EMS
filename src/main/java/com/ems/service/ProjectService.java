package com.ems.service;

import java.util.List;

import com.ems.model.Projects;
public interface ProjectService {
	
	public void addProjects(Projects p);
	
	public List<Projects> findAll();

}
