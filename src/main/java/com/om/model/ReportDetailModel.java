package com.om.model;

import java.util.Date;

public class ReportDetailModel {
	private String username;
	private int totalTime;
	private CheckInModel checkin;
	private CheckOutModel checkout;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}
	public CheckInModel getCheckin() {
		return checkin;
	}
	public void setCheckin(CheckInModel checkin) {
		this.checkin = checkin;
	}
	public CheckOutModel getCheckout() {
		return checkout;
	}
	public void setCheckout(CheckOutModel checkout) {
		this.checkout = checkout;
	}
}
