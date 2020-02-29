package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.model.Projects;

public interface ProjectRepository extends JpaRepository<Projects, Long>{

}
