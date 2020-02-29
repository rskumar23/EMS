package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.model.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Long>{

}
