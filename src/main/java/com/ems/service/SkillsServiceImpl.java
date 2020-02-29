package com.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dto.SkillsDTO;
import com.ems.model.Skills;
import com.ems.repository.SkillsRepository;

@Service
public class SkillsServiceImpl implements SkillService{

	@Autowired
	SkillsRepository skillsRepository;
	
	@Override
	public void addSkillls(Skills skills1) {
		Skills skills = new Skills();
		if(skills1.getSkillId() != null) {
			skills.setSkillId(skills1.getSkillId());
		}
		skills.setSkillName(skills1.getSkillName());
		skillsRepository.save(skills);
		
	}

	@Override
	public List<Skills> findAll() {
	
		return skillsRepository.findAll();
	}

	@Override
	public void deleteSkills(Long skillId) {
		skillsRepository.deleteById(skillId);
		
	}

	@Override
	public SkillsDTO updateSkills(Long skillId) {
		Skills skills =  skillsRepository.getOne(skillId);
		return convertModelToDTO(skills);
	}

	private SkillsDTO convertModelToDTO(Skills skills) {
		SkillsDTO skillDTO = new SkillsDTO(skills);
		skillDTO.setSkillId(skills.getSkillId());
		skillDTO.setSkillName(skills.getSkillName());
		return skillDTO;
	}

}
