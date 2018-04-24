package com.om.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.om.entities.CheckInEntity;
import com.om.model.ReportTimesheetModel;
import com.om.services.IReportTimesheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.om.entities.ReportTimesheetEntity;
import com.om.repositories.IReportTimesheetRepo;

@Service//(value = "ReportTimesheetService")
public class ReportTimesheetServiceImpl implements IReportTimesheetService {

	@Autowired
	private CheckInServiceImpl iCheckInService;

	@Override
	public List<ReportTimesheetModel> findReportByDate(Date date) {
		List<CheckInEntity> listCheckIn = new ArrayList<>();
		listCheckIn = iCheckInService.findCheckInByCreatedDate(date);

		List<ReportTimesheetModel> listReportTimesheet= getListReportTimesheet(listCheckIn);

		return listReportTimesheet;
	}

	@Override
	public List<ReportTimesheetModel> findAllReport() {
		List<CheckInEntity> listCheckIn = new ArrayList<>();
		listCheckIn = iCheckInService.findAllCheckIn();

		List<ReportTimesheetModel> listReportTimesheet= getListReportTimesheet(listCheckIn);

		return listReportTimesheet;
	}

	List<ReportTimesheetModel> getListReportTimesheet(List<CheckInEntity> listCheckIn) {

		List<ReportTimesheetModel> listReportTimesheet= new ArrayList<>();
		for(CheckInEntity checkin : listCheckIn) {
			ReportTimesheetModel reportTimesheet = new ReportTimesheetModel();

			//user id
			reportTimesheet.setUserId(checkin.getOwnerUser().getId());
			//user name
			reportTimesheet.setUserName(checkin.getOwnerUser().getUserName());

			//check in
			reportTimesheet.setCheckIn(checkin);

			//check out
			reportTimesheet.setCheckOut(checkin.getCheckOut());

			//total minute
			if(checkin.getCheckOut() != null) {
				Date start = checkin.getCreatedDate();
				Date end = reportTimesheet.getCheckOut().getCreatedDate();
				reportTimesheet.setTotalMinute( (end.getTime() - start.getTime()) / (60*1000));
			}

			listReportTimesheet.add(reportTimesheet);
		}

		return listReportTimesheet;
	}
}
