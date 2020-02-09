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
@Table(name="leave_sts")
public class EmployeeLeaveStatus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="lv_st_id", nullable = false, unique=true)
	private long lv_st_id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name="emp_leave_sts", joinColumns=@JoinColumn(name="lv_st_id"), inverseJoinColumns=@JoinColumn(name="uid"))
	private Employee employee;
	
	@Column(name="lv_reason", nullable = false)
	private String lv_reason;
	
	@Column(name="lv_cnt", nullable = false)
	private int lv_cnt;
	
	@Column(name="lv_strt_date", nullable = false)
	private Date lv_strt_date;
	
	@Column(name="lv_end_date", nullable = false)
	private Date lv_end_date;
	
	private boolean isHalfDay;

	public long getLv_st_id() {
		return lv_st_id;
	}

	public void setLv_st_id(long lv_st_id) {
		this.lv_st_id = lv_st_id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getLv_reason() {
		return lv_reason;
	}

	public void setLv_reason(String lv_reason) {
		this.lv_reason = lv_reason;
	}

	public int getLv_cnt() {
		return lv_cnt;
	}

	public void setLv_cnt(int lv_cnt) {
		this.lv_cnt = lv_cnt;
	}

	public Date getLv_strt_date() {
		return lv_strt_date;
	}

	public void setLv_strt_date(Date lv_strt_date) {
		this.lv_strt_date = lv_strt_date;
	}

	public Date getLv_end_date() {
		return lv_end_date;
	}

	public void setLv_end_date(Date lv_end_date) {
		this.lv_end_date = lv_end_date;
	}

	public boolean isHalfDay() {
		return isHalfDay;
	}

	public void setHalfDay(boolean isHalfDay) {
		this.isHalfDay = isHalfDay;
	}
	
	

}
