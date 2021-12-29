package com.mphasis.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mphasis.dto.FlightBookingRequest;
import com.mphasis.entity.PassangerInfo;
import com.mphasis.entity.PaymentInfo;
import com.mphasis.exception.CreaditLimitException;

@Component
public class Util {
	private static Map<String, Double> paymentMap= new HashMap<String, Double>();
	static{
		paymentMap.put("acc1",5000.0);
		paymentMap.put("acc2",8000.0);
		paymentMap.put("acc3",10000.0);
		paymentMap.put("acc4",12000.0);
		
	}
	
	public static boolean validateCreaditLimit(String accno, Double amt) {
		if(amt>paymentMap.get(accno)) {
			throw new CreaditLimitException("insufficent balance");
		}
		else
			return true;
	}
	
	/*
	 * public static void main(String[] args) throws JsonProcessingException {
	 * 
	 * PaymentInfo paymentInfo= new PaymentInfo(); PassangerInfo passangerInfo= new
	 * PassangerInfo();
	 * 
	 * passangerInfo.setPId(123456789l); passangerInfo.setName("vishal");
	 * passangerInfo.setFare(5000.0); passangerInfo.setSource("Nanded");
	 * passangerInfo.setDestination("pune");
	 * passangerInfo.setEmail("vrsonule9@gmail.com");
	 * passangerInfo.setTravelDate(new Date()); passangerInfo.setArrivalTime("3pm");
	 * passangerInfo.setPickupTime("1pm");
	 * 
	 * paymentInfo.setAccountNo("acc1"); paymentInfo.setAmt(5000.0);
	 * paymentInfo.setCardType("creadit card");
	 * paymentInfo.setPassangerId(passangerInfo.getPId());
	 * 
	 * FlightBookingRequest request= new FlightBookingRequest();
	 * request.setPassangerInfo(passangerInfo); request.setPaymentInfo(paymentInfo);
	 * ObjectMapper mapper= new ObjectMapper(); String writeValueAsString =
	 * mapper.writeValueAsString(request); System.out.println(writeValueAsString);
	 * 
	 * }
	 */

}
