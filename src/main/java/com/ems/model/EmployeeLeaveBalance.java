package com.ems.model;

import java.sql.Date;

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
@Table(name="leave_balance")
public class EmployeeLeaveBalance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="lv_blns_id", nullable = false, unique=true)
	private long lv_blns_id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name="emp_leave_blns", joinColumns=@JoinColumn(name="lv_st_id"), inverseJoinColumns=@JoinColumn(name="uid"))
	private Employee employee;
	
	private Date lv_crdt_date;
	
	private int lv_credited;

	public long getLv_blns_id() {
		return lv_blns_id;
	}

	public void setLv_blns_id(long lv_blns_id) {
		this.lv_blns_id = lv_blns_id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Date getLv_crdt_date() {
		return lv_crdt_date;
	}

	public void setLv_crdt_date(Date lv_crdt_date) {
		this.lv_crdt_date = lv_crdt_date;
	}

	public int getLv_credited() {
		return lv_credited;
	}

	public void setLv_credited(int lv_credited) {
		this.lv_credited = lv_credited;
	}
	
	
}

