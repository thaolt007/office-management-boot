package com.om.model;

import java.util.Date;

public class ReportTimesheetModel {
	private String userName;
	private Date timeCheckIn;
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
}
