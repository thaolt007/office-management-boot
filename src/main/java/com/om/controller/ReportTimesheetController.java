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
import org.springframework.web.bind.annotation.*;

import com.om.model.ReportTimesheetModel;

import javax.validation.Valid;

@RestController
@RequestMapping(value={"/api/report"})
public class ReportTimesheetController {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ICheckOutRepo.class);

	@Autowired
	private IReportTimesheetService iReportTimesheetService;

	@GetMapping(value={"", "timesheet"})
	public List<ReportTimesheetModel> getAllReportTimeSheet() {
		return iReportTimesheetService.findAllReport();
	}

	@GetMapping(value = "timesheet/get")
	public List<ReportTimesheetModel> getReportByDate(@RequestParam("date") Date date) {
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//		date = new Date("2018/04/17");
		return iReportTimesheetService.findReportByDate(date);
	}


}
