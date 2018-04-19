package com.om.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "om_user")
@Data
public class UserEntity implements Serializable{
	private static final long serialVersionUID = 1L; 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int id;
	
	@Column(nullable = false, length = 50, name = "om_username")
	private String userName;

	@Column(nullable = false, length = 50, name = "om_password")
	private String password;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ownerUser")
	@JsonIgnore
	private List<CheckInEntity> listCheckIn;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ownerUser")
	@JsonIgnore
	private List<CheckOutEntity> listCheckOut;

	public List<CheckOutEntity> getListCheckOut() {
		return listCheckOut;
	}

	public void setListCheckOut(List<CheckOutEntity> listCheckOut) {
		this.listCheckOut = listCheckOut;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}


	public UserEntity() {}
	public UserEntity(int id, String userName, String password,
			List<CheckInEntity> checkin, List<CheckOutEntity> checkout) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

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

	public List<CheckInEntity> getListCheckIn() {
		return listCheckIn;
	}

	public void setListCheckIn(List<CheckInEntity> listCheckIn) {
		this.listCheckIn = listCheckIn;
	}
}
