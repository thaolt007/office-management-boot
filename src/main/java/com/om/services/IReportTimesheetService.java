package com.om.services;

import java.util.Date;
import java.util.List;

import com.om.entities.ReportTimesheetEntity;
import com.om.model.ReportTimesheetModel;

public interface IReportTimesheetService {
	List<ReportTimesheetModel> findReportByDate(Date date);
}
