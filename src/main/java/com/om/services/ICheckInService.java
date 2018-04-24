package com.om.services;

import com.om.entities.CheckInEntity;
import com.om.model.CheckInModel;

import java.util.Date;
import java.util.List;

public interface ICheckInService {
    List<CheckInEntity> findCheckInByCreatedDate(Date date);
    List<CheckInEntity> findAllCheckIn();
    CheckInEntity saveCheckIn(CheckInModel checkin);
    CheckInEntity isCheckinDone(int userId, Date date);
    CheckInEntity findCheckInById(int id);
}
