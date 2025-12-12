package com.rpae.common_lib.DTOs.notification;

import lombok.Data;

@Data
public class NotificationLogDTO {
	private String notificationId;
	private String userId;
	private String alertId;
	private String symbol;
	private String channel;
	private boolean success;
	private String errorMessage;
	private long timestamp;
}
