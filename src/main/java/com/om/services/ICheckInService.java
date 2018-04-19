package com.om.services;

import com.om.entities.CheckInEntity;

import java.util.Date;
import java.util.List;

public interface ICheckInService {
    List<CheckInEntity> findCheckInByCreatedDate(Date date);
    List<CheckInEntity> findAllCheckIn();
    void saveCheckIn(CheckInEntity checkin);
}
