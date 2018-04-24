package com.om.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class CheckInModel {
	private int id;
	private String note;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	private Date createdDate;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	private Date modifiedDate;
	private int userId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getDateCreated() {
		return createdDate;
	}
	public void setDateCreated(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getDateModified() {
		return modifiedDate;
	}
	public void setDateModified(Date dateModified) {
		this.modifiedDate = dateModified;
	}

	@Override
	public String toString() {
		return "CheckInModel{" +
				"id=" + id +
				", note='" + note + '\'' +
				", dateCreated=" + createdDate +
				", dateModified=" + modifiedDate +
				", userId=" + userId +
				'}';
	}
}
