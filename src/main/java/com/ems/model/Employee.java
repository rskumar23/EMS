package com.ems.model;

import java.sql.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ems.model.Course;
import com.ems.model.Projects;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="uid", nullable = false, unique=true)
	private long uid;

	@Column(name = "email")
	private String email;

	@Column(name = "firstname")
	private String firstname; 

	@Column(name = "lastname")
	private String lastname;

	@Column(name="middlename")
	private String middlename;

	@Column(name = "password")
	private String password;

	@Column(name = "active")
	private boolean active;

	@Column(name="gender", nullable = false)
	private String gender;

	@Column(name="maritalstatus")
	private String maritalStatus;

	@Column(name="nationality", nullable = false)
	private String nationality;

	@Column(name="bldgrp")
	private String bldGrp;

	@Column(name="passportNo")
	private long passportNo;

	@Column(name="joiningDate", nullable = false)
	private Date joiningDate;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="emp_role", joinColumns=@JoinColumn(name="uid"), inverseJoinColumns=@JoinColumn(name="role_id"))
	private Set<Role> role;

	@Column(name="address")
	private String  address;

	@Column(name="phno", nullable = false)
	private long phno;

	@Column(name="bankId")
	private long bankId;

	@Column(name="designation")
	private String designation;

	@Column(name="managerUid")
	private long managerUid;

	@Column(name="experience")
	private float empExp;

	@Column(name="empResgDdate")
	private Date empResgDdate;

	@Column(name="isManager")
	private boolean isManager;

	@Column(name="isHR")
	private boolean isHR;


	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="emp_course", joinColumns=@JoinColumn(name="uid"), inverseJoinColumns=@JoinColumn(name="course_id"))
	private Set<Course> course;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="emp_project", joinColumns=@JoinColumn(name="uid"), inverseJoinColumns = @JoinColumn(name="prj_id"))
	private Projects project;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return role;
	}

	public void setRoles(Set<Role> roles) {
		this.role = roles;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getBldGrp() {
		return bldGrp;
	}

	public void setBldGrp(String bldGrp) {
		this.bldGrp = bldGrp;
	}

	public long getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(long passportNo) {
		this.passportNo = passportNo;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}

	public String getAddrId() {
		return address;
	}

	public void setAddrId(String address) {
		this.address = address;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public long getBankId() {
		return bankId;
	}

	public void setBankId(long bankId) {
		this.bankId = bankId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getManagerUid() {
		return managerUid;
	}

	public void setManagerUid(long managerUid) {
		this.managerUid = managerUid;
	}

	public float getEmpExp() {
		return empExp;
	}

	public void setEmpExp(float empExp) {
		this.empExp = empExp;
	}

	public Date getEmpResgDdate() {
		return empResgDdate;
	}

	public void setEmpResgDdate(Date empResgDdate) {
		this.empResgDdate = empResgDdate;
	}

	public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}

	public boolean isHR() {
		return isHR;
	}

	public void setHR(boolean isHR) {
		this.isHR = isHR;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public Projects getProject() {
		return project;
	}

	public void setProject(Projects project) {
		this.project = project;
	}

}