package com.om.services;

import com.om.entities.UserEntity;
import com.om.repositories.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private IUserRepo iUserRepo;
    public UserEntity findUserById(int id) {
        return iUserRepo.findById(id);
    };
}
