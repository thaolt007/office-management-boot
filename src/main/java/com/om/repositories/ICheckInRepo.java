package com.om.repositories;

import com.om.entities.CheckOutEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.om.entities.CheckInEntity;

import java.util.Date;
import java.util.List;

@Repository
public interface ICheckInRepo extends CrudRepository<CheckInEntity, Integer>{
    @Query("select checkin from CheckInEntity checkin where checkin.createdDate between ?1 and ?2")
    List<CheckInEntity> findByCreatedDate(Date dateMorning, Date dateEvening);
    @Query("select checkin from CheckInEntity checkin where checkin.ownerUser.id = ?1 and checkin.createdDate between ?2 and ?3")
    CheckInEntity isCheckinDone(int userId, Date dateMorning, Date dateEvening);
}
