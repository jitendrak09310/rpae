package com.rpae.common_lib.DTOs.alert;

import lombok.Data;

@Data
public class AlertErrorResponse {
	private String message;
	private long timestamp;
}
