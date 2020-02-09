package com.ems.model;

import java.io.File;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="documents")
public class Documents {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable = false, unique=true)
	private long id;
	
	@Column(name="docName")
	private String docName;
	
	@Column(name="docFile")
	private File docFile;
	
	@Column(name="upldDate")
	private Date upldDate;
	
	@Column(name="uid")
	private long uid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public File getDocFile() {
		return docFile;
	}

	public void setDocFile(File docFile) {
		this.docFile = docFile;
	}

	public Date getUpldDate() {
		return upldDate;
	}

	public void setUpldDate(Date upldDate) {
		this.upldDate = upldDate;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}
	
	
}
