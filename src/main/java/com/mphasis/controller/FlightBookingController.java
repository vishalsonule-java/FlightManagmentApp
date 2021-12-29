package com.mphasis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.dto.FlightBookingAcknowledgement;
import com.mphasis.dto.FlightBookingRequest;
import com.mphasis.service.FlightMgmtService;

@RestController
public class FlightBookingController {
	
	@Autowired
	private FlightMgmtService service;
	
	@PostMapping("/book")
	public ResponseEntity<FlightBookingAcknowledgement> bookFlightTicket(@RequestBody FlightBookingRequest request){
		
		FlightBookingAcknowledgement bookFlightTickt = service.bookFlightTickt(request);
		if(bookFlightTickt!=null) {
			
			return new ResponseEntity<FlightBookingAcknowledgement>(bookFlightTickt,HttpStatus.CREATED);
		}
		else
			return new ResponseEntity<FlightBookingAcknowledgement>(HttpStatus.BAD_REQUEST);
		
	}

}
