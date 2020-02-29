package com.ems.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empID")
	private long empID;

	@Column(name = "EmpUID")
	private String empUID;

	@Column(name = "FirstName")
	private String F_Name;

	@Column(name = "MiddleName")
	private String M_Name;

	@Column(name = "LastName")
	private String L_Name;

	@Column(name = "Email")
	private String email;

	@Column(name = "Password")
	private String password;

	@Column(name = "EmpAddr")
	private String addr;

	@Column(name = "Phno")
	private String phno;

	@Column(name = "Designation")
	private String designation;

	@Column(name = "Gender")
	private char gender;

	@Column(name = "Nationality")
	private String nationality;

	@Column(name = "JoiningDate")
	private Date joiningDate;

	@Column(name = "AddedBy")
	private long addedBy;

	@Column(name = "IsActive")
	private short isActive;

	@Column(name = "ManagerId")
	private long managerId;

	@Column(name = "BloodGroup")
	private String bloodGroup;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "roleId")
	private Role role;

	@Column(name = "BankId")
	private long bankId;

	@Column(name = "ResignationDate")
	private Date resignationDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "projectUid")
	private Projects projects;

	public long getEmpID() {
		return empID;
	}

	public void setEmpID(long empID) {
		this.empID = empID;
	}

	public String getEmpUID() {
		return empUID;
	}

	public void setEmpUID(String empUID) {
		this.empUID = empUID;
	}

	public String getF_Name() {
		return F_Name;
	}

	public void setF_Name(String f_Name) {
		F_Name = f_Name;
	}

	public String getM_Name() {
		return M_Name;
	}

	public void setM_Name(String m_Name) {
		M_Name = m_Name;
	}

	public String getL_Name() {
		return L_Name;
	}

	public void setL_Name(String l_Name) {
		L_Name = l_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public long getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(long addedBy) {
		this.addedBy = addedBy;
	}

	public short getIsActive() {
		return isActive;
	}

	public void setIsActive(short isActive) {
		this.isActive = isActive;
	}

	public long getManagerId() {
		return managerId;
	}

	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Role getRoles() {
		return role;
	}

	public void setRoles(Role role) {
		this.role = role;
	}

	public long getBankId() {
		return bankId;
	}

	public void setBankId(long bankId) {
		this.bankId = bankId;
	}

	public Date getResignationDate() {
		return resignationDate;
	}

	public void setResignationDate(Date resignationDate) {
		this.resignationDate = resignationDate;
	}
	
}