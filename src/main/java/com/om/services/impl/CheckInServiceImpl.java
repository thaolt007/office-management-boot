package com.om.services.impl;

import com.om.entities.CheckInEntity;
import com.om.repositories.ICheckInRepo;
import com.om.services.ICheckInService;
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
    public void saveCheckIn(CheckInEntity checkin) {
        iCheckInRepo.save(checkin);
    }


}
