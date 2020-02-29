package com.ems.service;

import java.util.List;

import com.ems.dto.NoticeDTO;
import com.ems.model.Notice;

public interface NoticeService {
	
	public void addNotice(NoticeDTO noticeDto);
	
	public List<Notice> findAll();
	
	public void deleteNotice(Long noticeId);
	
	public NoticeDTO updateNotice(Long noticeId);
	
	/*public Notice updateAndSaveNotice(long i, Notice notice);*/

}
