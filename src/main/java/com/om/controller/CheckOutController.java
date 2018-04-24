package com.om.controller;

import com.om.entities.CheckInEntity;
import com.om.entities.CheckOutEntity;
import com.om.model.CheckInModel;
import com.om.model.CheckOutModel;
import com.om.services.ICheckInService;
import com.om.services.ICheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin
@RequestMapping(value = "api/checkout")
public class CheckOutController {

    @Autowired
    private ICheckOutService iCheckOutService;
    @Autowired
    private ICheckInService iCheckInService;

    @PostMapping(value = "check/{id}")
    @CrossOrigin
    public ResponseEntity<CheckOutEntity> isCheckoutDone(@PathVariable(value = "id") int checkinId,
                                                        @RequestBody Date date) {
        System.out.println("UserId is checkout or not: " + checkinId);
        CheckOutEntity checkout = iCheckInService.findCheckInById(checkinId).getCheckOut();
        if(checkout == null) {
            return new ResponseEntity<CheckOutEntity>(checkout, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<CheckOutEntity>(checkout, HttpStatus.OK);
    }

    @PostMapping(value = "submit")
    @CrossOrigin
    public ResponseEntity<CheckOutEntity> saveCheckout(@RequestBody CheckOutModel checkoutModel) {
        System.out.println("Checkout submit: " + checkoutModel.toString());

        CheckOutEntity checkout = iCheckOutService.saveCheckOut(checkoutModel);
        if(checkout == null) {
            return new ResponseEntity<CheckOutEntity>(checkout, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<CheckOutEntity>(checkout, HttpStatus.OK);
    }
}
