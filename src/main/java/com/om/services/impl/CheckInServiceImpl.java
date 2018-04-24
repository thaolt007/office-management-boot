package com.om.services.impl;

import com.om.entities.CheckInEntity;
import com.om.entities.UserEntity;
import com.om.model.CheckInModel;
import com.om.repositories.ICheckInRepo;
import com.om.services.ICheckInService;
import com.om.services.IUserService;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class CheckInServiceImpl implements ICheckInService {
    @Autowired
    private ICheckInRepo iCheckInRepo;
    @Autowired
    private IUserService iUserService;

    public List<CheckInEntity> findCheckInByCreatedDate(Date date) {
        Date todayMorning = DateUtils.truncate(date, Calendar.DATE);
        Date todayEvening = DateUtils.addSeconds(DateUtils.addMinutes(DateUtils.addHours(todayMorning, 23), 59), 59);
        return (List<CheckInEntity>) iCheckInRepo.findByCreatedDate(todayMorning, todayEvening);
    }

    @Override
    public List<CheckInEntity> findAllCheckIn() {
        return (List<CheckInEntity>) iCheckInRepo.findAll();
    }

    @Override
    public CheckInEntity saveCheckIn(CheckInModel checkinModel) {
        CheckInEntity checkInEntity = new CheckInEntity();

        checkInEntity.setNote(checkinModel.getNote());
        checkInEntity.setCreatedDate(checkinModel.getDateCreated());
        checkInEntity.setModifiedDate(checkinModel.getDateModified());
        UserEntity user = iUserService.findUserById(checkinModel.getUserId());
        if(user == null) {
            return null;
        }
        checkInEntity.setOwnerUser(user);

        return iCheckInRepo.save(checkInEntity);
    }

    @Override
    public CheckInEntity isCheckinDone(int userId, Date date) {
        Date todayMorning = DateUtils.truncate(date, Calendar.DATE);
        Date todayEvening = DateUtils.addSeconds(DateUtils.addMinutes(DateUtils.addHours(todayMorning, 23), 59), 59);
        return iCheckInRepo.isCheckinDone(userId, todayMorning, todayEvening);
    }

    @Override
    public CheckInEntity findCheckInById(int id) {
        return iCheckInRepo.findById(id);
    }


}
