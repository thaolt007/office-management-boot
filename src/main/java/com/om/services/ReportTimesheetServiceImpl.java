package com.om.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.om.entities.ReportTimesheetEntity;
import com.om.repositories.IReportTimesheetRepo;

@Service
public class ReportTimesheetServiceImpl implements IReportTimesheetService{
	
	@Autowired
	private IReportTimesheetRepo reportTimesheetRepo;
	@Override
	public List<ReportTimesheetEntity> findReportByDate(String date) {
		// TODO Auto-generated method stub
		return reportTimesheetRepo.findReportByDate(date);
	}

}
