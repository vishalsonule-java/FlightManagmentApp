package com.mphasis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mphasis.entity.PaymentInfo;

public interface PaymentRepo extends JpaRepository<PaymentInfo, String> {

}
