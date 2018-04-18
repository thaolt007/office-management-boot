package com.om.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

public class ReportTimesheetModel {
	private String userName;
	private int totalMinute;
	private Date timeCheckIn;
	private Date timeCheckOut;

	public ReportTimesheetModel(String userName, int totalMinute, Date timeCheckIn, Date timeCheckOut) {
		this.userName = userName;
		this.totalMinute = totalMinute;
		this.timeCheckIn = timeCheckIn;
		this.timeCheckOut = timeCheckOut;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getTimeCheckIn() {
		return timeCheckIn;
	}
	public void setTimeCheckIn(Date timeCheckIn) {
		this.timeCheckIn = timeCheckIn;
	}
	public Date getTimeCheckOut() {
		return timeCheckOut;
	}
	public void setTimeCheckOut(Date timeCheckOut) {
		this.timeCheckOut = timeCheckOut;
	}
	public int getTotalMinute() {
		return totalMinute;
	}
	public void setTotalMinute(int totalMinute) {
		this.totalMinute = totalMinute;
	}
}
