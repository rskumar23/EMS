package com.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dto.NoticeDTO;
import com.ems.model.Notice;
import com.ems.repository.NoticeRepository;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	NoticeRepository noticeRepository;
	
	public void addNotice(NoticeDTO noticeDto) {
		System.out.println("noticeDto >>"+noticeDto);
		Notice notice = convertDTOToModel(noticeDto);
		noticeRepository.save(notice);
	}
	
	public List<Notice> findAll() {
		
		return noticeRepository.findAll();
	}

	public void deleteNotice(Long noticeId) {
		noticeRepository.deleteById(noticeId);
	}

	public NoticeDTO updateNotice(Long noticeId) {
		Notice notice = noticeRepository.getOne(noticeId);
		return convertModelToDTO(notice);
		
	}
	public Notice convertDTOToModel(NoticeDTO noticeDto) {
		Notice notice = new Notice();
		System.out.println("noticeDto.getId() Above If >>: "+noticeDto.getId());
		if(noticeDto.getId() != null) {
			notice.setId(noticeDto.getId());
			System.out.println("Under If>>");
		}
		notice.setNoticeTitle(noticeDto.getNoticeTitle());
		notice.setNoticeDescription(noticeDto.getNoticeDescription());
		notice.setReceivers(noticeDto.getReceivers());
		return notice;
		
	}
	public NoticeDTO convertModelToDTO (Notice notice) {
		NoticeDTO noticeDto = new NoticeDTO();
		noticeDto.setId(notice.getId());
		noticeDto.setNoticeTitle(notice.getNoticeTitle());
		noticeDto.setNoticeDescription(notice.getNoticeDescription());
		noticeDto.setReceivers(notice.getReceivers());
		System.out.println("convertModelToDTO >> "+noticeDto);
		return noticeDto;
		
	}

	
/*	public Notice updateAndSaveNotice(long noticeId, Notice notice) {
		Optional<Notice> newNotice = this.noticeRepository.findById(notice.getId());
		
		if(newNotice.isPresent()) {
			Notice updateNotice = newNotice.get();
			System.out.println(" updateAndSaveNotice serviceImpl!!");
			System.out.println("notice.getId() : "+notice.getId());
			updateNotice.setId(notice.getId());
			System.out.println("notice.getNoticeTitle() : "+notice.getNoticeTitle());
			updateNotice.setNoticeTitle(notice.getNoticeTitle());
			updateNotice.setNoticeDescription(notice.getNoticeDescription());
			updateNotice.setReceivers(notice.getReceivers());
			noticeRepository.save(updateNotice);
			return updateNotice;
		}
		return notice;
		
		
		
	}*/

	
}
