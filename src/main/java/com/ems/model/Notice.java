package com.ems.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="notice")
public class Notice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	
	private String noticeTitle;
	
	private String noticeDescription;
	
	private String receivers;
	
	/*@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="emp_notice", joinColumns=@JoinColumn(name="id"), inverseJoinColumns=@JoinColumn(name="uid"))
	private List <Employee> employee;*/

	

	@Override
	public String toString() {
		return "Notice [Id=" + Id + ", noticeTitle=" + noticeTitle + ", noticeDescription=" + noticeDescription + ", receivers="
				+ receivers + "]";
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeDescription() {
		return noticeDescription;
	}

	public void setNoticeDescription(String noticeDescription) {
		this.noticeDescription = noticeDescription;
	}

	public String getReceivers() {
		return receivers;
	}

	public void setReceivers(String receivers) {
		this.receivers = receivers;
	}

	

	

}
