package com.om.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CheckInModel {
	private int id;
	private String note;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dateCreated;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dateModified;
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
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	@Override
	public String toString() {
		return "CheckInModel{" +
				"id=" + id +
				", note='" + note + '\'' +
				", dateCreated=" + dateCreated +
				", dateModified=" + dateModified +
				", userId=" + userId +
				'}';
	}
}
