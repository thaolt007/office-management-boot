package com.om.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.om.entities.ReportTimesheetEntity;
import com.om.model.ReportTimesheetModel;

@Repository
public interface IReportTimesheetRepo extends JpaRepository<ReportTimesheetEntity, Integer>{
//	List<ReportTimesheetModel> findReportByDate(Date date);
}
