package com.om.controller;

import com.om.model.ReportTimesheetModel;
import com.om.repositories.IUserRepo;
import com.om.services.ICheckInService;
import com.om.services.ICheckOutService;
import com.om.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kien.lovan on 4/19/2018.
 */
@RestController
@RequestMapping(value={"/api/report/detail"})
public class ReportDetailController {
    private ICheckInService iCheckInService;
    @Autowired
    private ICheckOutService iCheckOutService;
    @Autowired
    private IUserService iUserService;

    @GetMapping("")
    public String postReportDetail() {
        return "report detail";
    }
}
