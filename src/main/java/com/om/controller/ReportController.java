package com.om.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.om.model.ReportTimesheetModel;
import com.om.services.ReportTimesheetServiceImpl;

@RestController
@RequestMapping(value="/api/report")
public class ReportController {
	@Autowired
	private ReportTimesheetServiceImpl reportTimesheetService;
	
//	@GetMapping(value="/")	
//	List<ReportTimesheetModel> reportTimeSheet() {
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//		Date d = new Date();
//		Date date = new Date("2018/04/17");
//		return dateFormat.format(d).equals(dateFormat.format(date));
//		System.out.print(reportTimesheetService.findReportByDate(dateFormat.format(date)).toString());
//		return reportTimesheetService.findReportByDate(dateFormat.format(date)); 
//		return ;
//	}
}
