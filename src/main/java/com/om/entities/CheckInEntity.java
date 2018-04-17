package com.om.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "om_checkin")
public class CheckInEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int id;
	
	@Column(name = "note", length = 255)
	private String note;
	
	@Column(name = "check_type")
	private int type;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "created_date", nullable = false)
	private Date createdDate;
	
	@Column(name = "modified_date", nullable = false)
	private Date modifiedDate;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	
	private UserEntity ownerCheckIn;
	
	public CheckInEntity(int id, String note, int type, int userId,
			Date createdDate, Date modifiedDate, UserEntity ownerCheckIn) {
		super();
		this.id = id;
		this.note = note;
		this.type = type;
		this.userId = userId;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.ownerCheckIn = ownerCheckIn;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
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
	public UserEntity getOwnerCheckIn() {
		return ownerCheckIn;
	}
	public void setOwnerCheckIn(UserEntity ownerCheckIn) {
		this.ownerCheckIn = ownerCheckIn;
	}
	
}
