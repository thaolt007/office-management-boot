package com.om.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.om.entities.UserEntity;

import java.util.List;

@Repository
public interface IUserRepo extends CrudRepository<UserEntity, Integer>{
	UserEntity findById(int id);
}
