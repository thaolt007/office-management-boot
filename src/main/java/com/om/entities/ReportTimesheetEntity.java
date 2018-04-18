package com.om.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="om_report")
@Data
public class ReportTimesheetEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@JoinColumn(name="user_id")
	@OneToOne
	private UserEntity userId;

	@JoinColumn(name="checkin_id")
	@OneToOne
	private CheckInEntity checkinId;

	@JoinColumn(name="checkout_id")
	@OneToOne
	private CheckOutEntity checkOutId;

	@Column(name="work_in_minute")
	private int totalMinute;

	public ReportTimesheetEntity() {}

	public ReportTimesheetEntity(UserEntity userId, CheckInEntity checkinId, CheckOutEntity checkOutId, int totalMinute) {
		this.userId = userId;
		this.checkinId = checkinId;
		this.checkOutId = checkOutId;
		this.totalMinute = totalMinute;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserEntity getUserId() {
		return userId;
	}

	public void setUserId(UserEntity userId) {
		this.userId = userId;
	}

	public CheckInEntity getCheckinId() {
		return checkinId;
	}

	public void setCheckinId(CheckInEntity checkinId) {
		this.checkinId = checkinId;
	}

	public CheckOutEntity getCheckOutId() {
		return checkOutId;
	}

	public void setCheckOutId(CheckOutEntity checkOutId) {
		this.checkOutId = checkOutId;
	}

	public int getTotalMinute() {
		return totalMinute;
	}

	public void setTotalMinute(int totalMinute) {
		this.totalMinute = totalMinute;
	}
}
