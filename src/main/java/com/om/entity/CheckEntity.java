package com.om.entity;

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
@Table(name = "om_check")
public class CheckEntity implements Serializable{
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
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Column(name = "created_date", nullable = false)
	private Date createdDate;
	
	@Column(name = "modified_date", nullable = false)
	private Date modifiedDate;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@ManyToOne()
	@JoinColumn(name="user_id")
	private UserEntity owner;
	
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
	public UserEntity getOwner() {
		return owner;
	}
	public void setOwner(UserEntity owner) {
		this.owner = owner;
	}

	
}
