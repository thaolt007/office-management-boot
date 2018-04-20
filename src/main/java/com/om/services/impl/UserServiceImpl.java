package com.om.services.impl;

import com.om.entities.UserEntity;
import com.om.repositories.IUserRepo;
import com.om.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepo iUserRepo;
    public UserEntity findUserById(int id) {
        return iUserRepo.findById(id);
    };
}
