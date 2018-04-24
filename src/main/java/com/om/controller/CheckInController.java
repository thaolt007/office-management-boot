package com.om.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.om.entities.CheckInEntity;
import com.om.model.CheckInModel;
import com.om.model.UserModel;
import com.om.repositories.ICheckInRepo;
import com.om.services.ICheckInService;
import com.om.services.IUserService;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/checkin")
public class CheckInController {

    @Autowired
    private ICheckInRepo iCheckInRepo;
    @Autowired
    private ICheckInService iCheckInService;
    @Autowired
    private IUserService iUserService;

    @PostMapping(value = "submit")
    public ResponseEntity<CheckInEntity> saveCheckin(@RequestBody CheckInModel checkinModel) {
        System.out.println("Checkin submit: " + checkinModel.toString());

        CheckInEntity checkin = iCheckInService.saveCheckIn(checkinModel);
        if(checkin == null) {
            return new ResponseEntity<CheckInEntity>(checkin, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<CheckInEntity>(checkin, HttpStatus.OK);
    }

    @PostMapping(value = "check/{id}")
    @CrossOrigin
    public ResponseEntity<CheckInEntity> isCheckinDone(@PathVariable(value = "id") int userId,
                                                       @RequestBody Date date) {
        System.out.println("UserId is checkin or not: " + date);
//		Date date = new Date("2018/04/17");
        CheckInEntity checkin = iCheckInService.isCheckinDone(userId, date);
        if(checkin == null) {
            return new ResponseEntity<CheckInEntity>(checkin, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<CheckInEntity>(checkin, HttpStatus.OK);
    }
}
