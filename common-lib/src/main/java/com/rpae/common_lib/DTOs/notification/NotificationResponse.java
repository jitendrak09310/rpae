package com.rpae.common_lib.DTOs.notification;

import lombok.Data;

@Data
public class NotificationResponse {
	private String notificationId;
	private String userId;
	private String channel; // EMAIL/SMS/WHATSAPP
	private boolean success;
	private String message;
	private long timestamp;
}
