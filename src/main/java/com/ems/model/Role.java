package com.ems.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {
 
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 @Column(name="id")
 private long id;
 
 @Column(name="role")
 private String roles;
 
 @OneToMany(mappedBy = "role")
 private List <Employee> employee;
 
 public long getId() {
  return id;
 }

 public void setId(long id) {
  this.id = id;
 }

 public String getRoles() {
  return roles;
 }

 public void setRoles(String roles) {
  this.roles = roles;
 }

@Override
public String toString() {
	return "Role [id=" + id + ", role=" + roles + ", employee=" + employee + ", getId()=" + getId() + ", getRole()="
			+ getRoles() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
 
}