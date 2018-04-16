package com.om.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "om_user")
public class UserEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int id;
	
	@Column(nullable = false, length = 50)
	private String userName;
	
	@Column(nullable = false, length = 50)
	private String password;
	
	@OneToMany(mappedBy = "owner")
	private List<CheckEntity> check;
	
//	@OneToMany(mappedBy = "owner")
//	private List<CheckEntity> check;
	
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
	
	
}
