package com.rpae.common_lib.DTOs.notification;

import lombok.Data;

@Data
public class NotificationErrorResponse {
	private String message;
	private long timestamp;
}
