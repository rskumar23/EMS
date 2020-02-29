package com.ems.service;

import java.util.List;

import com.ems.dto.SkillsDTO;
import com.ems.model.Skills;

public interface SkillService {
	
	public void addSkillls(Skills skills);
	public List<Skills> findAll();
	public void deleteSkills(Long skillId);
	public SkillsDTO updateSkills(Long skillId);

}
