package com.om.services;

import java.util.Date;
import java.util.List;

import com.om.model.ReportTimesheetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.om.entities.ReportTimesheetEntity;
import com.om.repositories.IReportTimesheetRepo;

@Service//(value = "ReportTimesheetService")
public class ReportTimesheetServiceImpl implements IReportTimesheetService{
	

	@Override
	public List<ReportTimesheetModel> findReportByDate(Date date) {
		return null;
	}

}
