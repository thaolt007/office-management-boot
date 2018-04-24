package com.om.services;

import com.om.entities.CheckInEntity;
import com.om.entities.CheckOutEntity;
import com.om.model.CheckInModel;
import com.om.model.CheckOutModel;

import java.util.Date;
import java.util.List;

public interface ICheckOutService {
    CheckOutEntity saveCheckOut(CheckOutModel checkout);
}
