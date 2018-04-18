package com.om.services;

import com.om.entities.UserEntity;

public interface IUserService {
    UserEntity findUserById(int id);
}
