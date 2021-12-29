package com.mphasis.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.dto.FlightBookingAcknowledgement;
import com.mphasis.dto.FlightBookingRequest;
import com.mphasis.entity.PassangerInfo;
import com.mphasis.entity.PaymentInfo;
import com.mphasis.repo.PassangerRepo;
import com.mphasis.repo.PaymentRepo;
import com.mphasis.util.Util;

@Service
public class FlightMgmtServiceImpl implements FlightMgmtService {
	
	@Autowired
	private PassangerRepo passangerRepo;
	
	@Autowired
	private PaymentRepo paymentRepo;

	@Override
	@Transactional
	public FlightBookingAcknowledgement bookFlightTickt(FlightBookingRequest request) {
		
		FlightBookingAcknowledgement acknowledgement=null;
		
		
		PaymentInfo paymentInfo = paymentRepo.save(request.getPaymentInfo());
		Util.validateCreaditLimit(paymentInfo.getAccountNo(), paymentInfo.getAmt());
		PassangerInfo passangerInfo = passangerRepo.save(request.getPassangerInfo());
		acknowledgement= new FlightBookingAcknowledgement();
		acknowledgement.setStatus("success");
		acknowledgement.setPnrNo("123456789");
		acknowledgement.setPassangerInfo(passangerInfo);
		acknowledgement.setTotalFare(paymentInfo.getAmt());
		return acknowledgement;
	}

}
