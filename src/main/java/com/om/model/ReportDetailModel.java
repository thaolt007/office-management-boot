package com.om.model;

import java.util.Date;

public class ReportDetailModel {
	private String username;
	private int totalTime;
	private CheckModel checkin;
	private CheckModel checkout;
	
	public CheckModel getCheckin() {
		return checkin;
	}
	public void setCheckin(CheckModel checkin) {
		this.checkin = checkin;
	}
	public CheckModel getCheckout() {
		return checkout;
	}
	public void setCheckout(CheckModel checkout) {
		this.checkout = checkout;
	}
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
	
	
}
