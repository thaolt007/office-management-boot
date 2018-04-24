package com.om.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "om_checkout")
@Data
public class CheckOutEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "note", length = 255)
	private String note;
	
	@Column(name = "created_date", nullable = false)
	private Date createdDate;
	
	@Column(name = "modified_date", nullable = false)
	private Date modifiedDate;


	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private UserEntity ownerUser;

	@OneToOne(mappedBy = "checkOut")
	@JsonIgnore
	private CheckInEntity checkIn;


	public CheckInEntity getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(CheckInEntity checkIn) {
		this.checkIn = checkIn;
	}

	public UserEntity getOwnerUser() {
		return ownerUser;
	}

	public void setOwnerUser(UserEntity ownerUser) {
		this.ownerUser = ownerUser;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
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
}
