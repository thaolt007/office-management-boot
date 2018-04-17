package com.om.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.om.entities.CheckInEntity;

@Repository
public interface ICheckInRepo extends CrudRepository<CheckInEntity, Integer>{
}
