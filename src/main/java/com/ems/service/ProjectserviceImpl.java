package com.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ems.model.Projects;
import com.ems.repository.ProjectRepository;

public class ProjectserviceImpl implements ProjectService{


	@Autowired
	ProjectRepository projectRepository;
	public void addProjects(Projects p) {
		
		projectRepository.save(p);
	}


	public List<Projects> findAll() {
		
		return projectRepository.findAll();
	}

}
