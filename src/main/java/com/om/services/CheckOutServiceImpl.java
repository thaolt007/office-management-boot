package com.om.services;

import com.om.entities.CheckOutEntity;
import com.om.repositories.ICheckOutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckOutServiceImpl implements ICheckOutService{

    @Autowired
    private ICheckOutRepo iCheckOutRepo;
    @Override
    public CheckOutEntity findCheckOutById(int id) {
        return iCheckOutRepo.findById(id);
    }
}
