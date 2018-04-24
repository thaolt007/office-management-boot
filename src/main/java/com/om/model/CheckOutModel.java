package com.om.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CheckOutModel {
	private int id;
	private String note;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	private Date createdDate;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	private Date modifiedDate;
	private int userId;
	private int checkinId;
	
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getCheckinId() {
		return checkinId;
	}

	public void setCheckinId(int checkinId) {
		this.checkinId = checkinId;
	}

	@Override
	public String toString() {
		return "CheckOutModel{" +
				"id=" + id +
				", note='" + note + '\'' +
				", createdDate=" + createdDate +
				", modifiedDate=" + modifiedDate +
				", userId=" + userId +
				", checkinId=" + checkinId +
				'}';
	}
}
