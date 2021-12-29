package com.mphasis.service;

import com.mphasis.dto.FlightBookingAcknowledgement;
import com.mphasis.dto.FlightBookingRequest;

public interface FlightMgmtService {
	
	public FlightBookingAcknowledgement bookFlightTickt(FlightBookingRequest request);

}
