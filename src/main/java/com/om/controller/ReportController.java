package com.om.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import com.om.entities.CheckInEntity;
import com.om.entities.CheckOutEntity;
import com.om.entities.ReportTimesheetEntity;
import com.om.entities.UserEntity;
import com.om.model.UserModel;
import com.om.repositories.ICheckInRepo;
import com.om.repositories.ICheckOutRepo;
import com.om.repositories.IUserRepo;
import com.om.services.*;
import org.apache.commons.lang.time.DateUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.om.model.ReportTimesheetModel;

@RestController
@RequestMapping(value="/api/report")
public class ReportController {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ICheckOutRepo.class);

	@Autowired
	private ICheckOutRepo iCheckOutRepo;
	@Autowired
	private ICheckInRepo iCheckInRepo;
	@Autowired
	private ICheckInService iCheckInService;
	@Autowired
	private ICheckOutService iCheckOutService;
	@Autowired
	private IUserRepo iUserRepo;
	@Autowired
	private IUserService iUserService;

	@GetMapping(value="/")
	public List<ReportTimesheetModel> reportTimeSheet() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date("2018/04/17");
//		return iUserService.findUserById(1);
		List<CheckInEntity> listCheckIn = iCheckInService.findCheckInByCreatedDate(date);
		for(CheckInEntity checkin : listCheckIn) {
			String name = iUserService.findUserById(checkin.getId()).getUserName();
//			int totalMinute =
			Date checkout = iCheckOutService.findCheckOutById(checkin.getId()).getCreatedDate();
		}
		return null;
	}
}
