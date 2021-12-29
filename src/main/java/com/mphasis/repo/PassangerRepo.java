package com.mphasis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mphasis.entity.PassangerInfo;

public interface PassangerRepo extends JpaRepository<PassangerInfo, Long> {

}
