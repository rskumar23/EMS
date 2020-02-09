package com.ems.model;

import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="notice")
public class Notice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long noticeId;
	
	@Column(name="noticeTitle")
	private String noticeTitle;
	
	@Column(name="noticeDecs")
	private String noticeDecs;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="emp_notice", joinColumns=@JoinColumn(name="id"), inverseJoinColumns=@JoinColumn(name="uid"))
	private List <Employee> employee;

	public long getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(long noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeDecs() {
		return noticeDecs;
	}

	public void setNoticeDecs(String noticeDecs) {
		this.noticeDecs = noticeDecs;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	
	
	
	

}
