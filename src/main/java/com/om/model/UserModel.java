package com.om.model;

import com.om.entities.CheckInEntity;
import com.om.entities.CheckOutEntity;

import java.util.List;

public class UserModel {
	private int id;
	private String userName;
	private String password;
	private List<CheckInEntity> checkInEntityList ;
	private List<CheckOutEntity> checkOutEntityList ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<CheckInEntity> getCheckInEntityList() {
		return checkInEntityList;
	}

	public void setCheckInEntityList(List<CheckInEntity> checkInEntityList) {
		this.checkInEntityList = checkInEntityList;
	}

	public List<CheckOutEntity> getCheckOutEntityList() {
		return checkOutEntityList;
	}

	public void setCheckOutEntityList(List<CheckOutEntity> checkOutEntityList) {
		this.checkOutEntityList = checkOutEntityList;
	}
}
