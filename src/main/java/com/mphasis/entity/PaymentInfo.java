package com.mphasis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="PAYMENT_INFO")
public class PaymentInfo {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name="uuid2",strategy = "org.hibernate.id.UUIDGenerator")
	private String paymentId;
	private String accountNo;
	private Double amt;
	private String cardType;
	private Long PassangerId;
}
