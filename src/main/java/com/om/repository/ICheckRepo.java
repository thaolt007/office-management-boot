package com.om.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.om.entity.CheckEntity;
import com.om.entity.UserEntity;

public interface ICheckRepo extends JpaRepository<CheckEntity, Integer>{
	CheckEntity findCheckEntityByUserId(int userId);
	void saveCheckIn(CheckEntity checkIn);
	void saveCheckOut(CheckEntity checkOut);
	CheckEntity getCheckInByUserId(UserEntity user);
	CheckEntity getCheckOutByUserId(UserEntity user);
}
