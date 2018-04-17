package com.om.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

//@Entity(name="reportTimesheetModel")
public class ReportTimesheetModel {
//	@Column
	private String userName;
//	@Column
	private int totalMinute;
//	@Column
	private Date timeCheckIn;
//	@Column
	private Date timeCheckOut;
	
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
