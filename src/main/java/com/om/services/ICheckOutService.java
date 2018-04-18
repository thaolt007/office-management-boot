package com.om.services;

import com.om.entities.CheckOutEntity;

public interface ICheckOutService {
    CheckOutEntity findCheckOutById(int id);
}
