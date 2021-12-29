package com.mphasis.dto;

import com.mphasis.entity.PassangerInfo;

import lombok.Data;

@Data
public class FlightBookingAcknowledgement {

	private String status;
	private Double totalFare;
	private String pnrNo;
	private PassangerInfo passangerInfo;
}
