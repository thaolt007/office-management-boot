package com.om.controller;

import java.io.Console;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import com.om.entities.CheckInEntity;
import com.om.entities.CheckOutEntity;
import com.om.entities.ReportTimesheetEntity;
import com.om.entities.UserEntity;
import com.om.model.CheckOutModel;
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
@RequestMapping(value={"/api/report"})
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

	@GetMapping(value={"", "timesheet"})
	public List<ReportTimesheetModel> reportTimeSheetByDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date("2018/04/17");
		List<ReportTimesheetModel> listReport = new ArrayList<ReportTimesheetModel>();


		List<ReportTimesheetModel> listReportTimesheet= new ArrayList<>();

		List<CheckInEntity> listCheckIn = new ArrayList<>();
		listCheckIn = iCheckInService.findCheckInByCreatedDate(date);

		for(CheckInEntity checkin : listCheckIn) {
			ReportTimesheetModel reportTimesheet = new ReportTimesheetModel();

			//user name
			reportTimesheet.setUserName(checkin.getOwnerUser().getUserName());

			//check in
			reportTimesheet.setCheckIn(checkin);

			//check out
			boolean hasCheckOut = false;
			List<CheckOutEntity> listCheckOut = iUserService.findUserById(checkin.getOwnerUser().getId()).getListCheckOut();
			for (CheckOutEntity checkout : listCheckOut) {
				Date d = checkout.getCreatedDate();
				int oneDayMilliseconds = 60*60*24*1000;
				if( d.getTime() >= date.getTime() && d.getTime() <= (date.getTime() + oneDayMilliseconds)) {
					reportTimesheet.setCheckOut(checkout);
					hasCheckOut = true;
					break;
				}
			}

			//total minute
			if(hasCheckOut) {
				Date start = checkin.getCreatedDate();
				Date end = reportTimesheet.getCheckOut().getCreatedDate();
				reportTimesheet.setTotalMinute( (end.getTime() - start.getTime()) / (60*1000));
			}

			listReportTimesheet.add(reportTimesheet);
		}

		return listReportTimesheet;
	}

	@GetMapping("detail")
	public String getReportDetail() {
		return "report detail";
	}

	@GetMapping("user")
	public List<UserEntity> getAllUser() {

		return (List<UserEntity>) iUserRepo.findAll();
	}
}
