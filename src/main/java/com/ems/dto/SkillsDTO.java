package com.ems.dto;

import com.ems.model.Skills;

public class SkillsDTO {
	private Long skillId;
	
	private String skillName;
	
	public SkillsDTO(Skills skills) {
		this.skillId=skills.getSkillId();
		this.skillName=skills.getSkillName();
	}

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	

}
