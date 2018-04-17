package com.om.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.om.entities.CheckInEntity;

@Repository
public interface ICheckRepo extends JpaRepository<CheckInEntity, Integer>{
}
