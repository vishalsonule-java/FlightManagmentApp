package com.mphasis.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorInfo {
	private Integer status;
	private String msg;
	private LocalDateTime date;

}
