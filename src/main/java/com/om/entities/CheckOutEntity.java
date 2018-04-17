package com.om.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "om_checkout")
public class CheckOutEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int id;
	
	@Column(name = "note", length = 255)
	private String note;
	
	@Column(name = "check_type")
	private int type;
	
	@Column(name = "created_date", nullable = false)
	private Date createdDate;
	
	@Column(name = "modified_date", nullable = false)
	private Date modifiedDate;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	private UserEntity ownerCheckOut;

	
	public CheckOutEntity(int id, String note, int type,
			Date createdDate, Date modifiedDate, UserEntity ownerCheckOut) {
		super();
		this.id = id;
		this.note = note;
		this.type = type;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.ownerCheckOut = ownerCheckOut;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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

	public UserEntity getOwnerCheckOut() {
		return ownerCheckOut;
	}

	public void setOwnerCheckOut(UserEntity ownerCheckOut) {
		this.ownerCheckOut = ownerCheckOut;
	}
	
	
	
}
