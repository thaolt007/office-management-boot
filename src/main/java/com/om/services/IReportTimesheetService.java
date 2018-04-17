package com.om.services;

import java.util.List;

import com.om.entities.ReportTimesheetEntity;

public interface IReportTimesheetService {
//	List<ReportTimesheetModel> findReportByDate(Date date);

	List<ReportTimesheetEntity> findReportByDate(String date);
}
