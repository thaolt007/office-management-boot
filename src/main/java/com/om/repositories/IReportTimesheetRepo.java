package com.om.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.om.entities.ReportTimesheetEntity;
import com.om.model.ReportTimesheetModel;

@Repository
public interface IReportTimesheetRepo extends JpaRepository<ReportTimesheetEntity, Integer> {
	@Query(value = "select u.om_username as userName, timestampdiff(minute, cin.modified_date, cout.modified_date) as totalMinute,"
			+ " cin.modified_date as timeCheckIn, cout.modified_date as timeCheckOut from om_user u"
			+ " inner join"
			+ " (select * from om_checkin checkin where cast(checkin.modified_date as date) = ?1) cin"
			+ " on u.id = cin.in_user_id"
			+ " left join"
			+ " (select * from om_checkout checkout where cast(checkout.modified_date as date) = ?1) cout"
			+ " on u.id = cout.user_id;", nativeQuery = true)
	// @Query
	List<ReportTimesheetEntity> findReportByDate(String date);
}
