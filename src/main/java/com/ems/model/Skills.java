package com.ems.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="skills")
public class Skills {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="skill_id", nullable = false, unique=true)
	private long skill_id;
	
	@Column(name="skill_name", nullable = false, unique=true)
	private String skill_name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name="emp_skills", joinColumns=@JoinColumn(name="skill_id"), inverseJoinColumns=@JoinColumn(name="uid"))
	private Employee employee;

	public long getSkill_id() {
		return skill_id;
	}

	public void setSkill_id(long skill_id) {
		this.skill_id = skill_id;
	}

	public String getSkill_name() {
		return skill_name;
	}

	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
