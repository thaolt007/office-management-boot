package com.om.services.impl;

import com.om.entities.CheckInEntity;
import com.om.entities.CheckOutEntity;
import com.om.entities.UserEntity;
import com.om.model.CheckOutModel;
import com.om.repositories.ICheckInRepo;
import com.om.repositories.ICheckOutRepo;
import com.om.services.ICheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CheckOutServiceImpl implements ICheckOutService {

    @Autowired
    private ICheckOutRepo iCheckOutRepo;
    @Autowired
    private ICheckInRepo iCheckInRepo;

    @Override
    public CheckOutEntity saveCheckOut(CheckOutModel checkoutModel) {
        CheckInEntity checkInEntity = iCheckInRepo.findById(checkoutModel.getCheckinId());

        UserEntity userEntity = checkInEntity.getOwnerUser();

        CheckOutEntity checkOutEntity = new CheckOutEntity();
        checkOutEntity.setCreatedDate(checkoutModel.getCreatedDate());
        checkOutEntity.setModifiedDate(checkoutModel.getModifiedDate());
        checkOutEntity.setNote(checkoutModel.getNote());
        checkOutEntity.setOwnerUser(userEntity);
        checkOutEntity.setCheckIn(checkInEntity);

        checkOutEntity = iCheckOutRepo.save(checkOutEntity);
        checkInEntity.setCheckOut(checkOutEntity);
        iCheckInRepo.save(checkInEntity);

        return checkOutEntity;
    }

}
