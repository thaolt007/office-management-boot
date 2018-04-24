package com.om.repositories;

import com.om.entities.CheckInEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.om.entities.CheckOutEntity;

import java.util.Date;
import java.util.List;

public interface ICheckOutRepo extends CrudRepository<CheckOutEntity, Integer>{
}
