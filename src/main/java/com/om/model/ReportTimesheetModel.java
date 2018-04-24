package com.om.model;

import com.om.entities.CheckInEntity;
import com.om.entities.CheckOutEntity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

public class ReportTimesheetModel {
	private int userId;
	private String userName;
	private long totalMinute;
	private CheckInEntity checkIn;
	private CheckOutEntity checkOut;

	public ReportTimesheetModel() {}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getTotalMinute() {
		return totalMinute;
	}

	public void setTotalMinute(long totalMinute) {
		this.totalMinute = totalMinute;
	}

	public CheckInEntity getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(CheckInEntity checkIn) {
		this.checkIn = checkIn;
	}

	public CheckOutEntity getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(CheckOutEntity checkOut) {
		this.checkOut = checkOut;
	}
}
