package com.om.repositories;

import org.springframework.data.repository.CrudRepository;

import com.om.entities.CheckOutEntity;

public interface ICheckOutRepo extends CrudRepository<CheckOutEntity, Integer>{
    CheckOutEntity findById(int id);
}
