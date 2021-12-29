package com.mphasis.dto;

import com.mphasis.entity.PassangerInfo;
import com.mphasis.entity.PaymentInfo;

import lombok.Data;

@Data
public class FlightBookingRequest {

	private PassangerInfo passangerInfo;
	private PaymentInfo paymentInfo;

}
