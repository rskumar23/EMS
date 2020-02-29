package com.ems.dto;

import com.ems.model.Notice;

public class NoticeDTO {
	
	
	private Long Id;
	
	private String noticeTitle;
	
	private String noticeDescription;
	
	private String receivers;
	
	public NoticeDTO() {
		
	}
	
	public NoticeDTO(Notice notice) {
		this.Id = notice.getId();
		this.noticeTitle = notice.getNoticeTitle();
		this.noticeDescription = notice.getNoticeDescription();
		this.receivers = notice.getReceivers();
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
