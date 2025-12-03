package com.rpae.common_lib.DTOs.history;

import lombok.Data;

@Data
public class NotificationHistoryRecord {
	private String id;
	private String notificationId;
	private String userId;
	private String alertId;
	private String symbol;
	private String channel; // EMAIL/SMS/WHATSAPP
	private boolean success;
	private String errorMessage;
	private long timestamp;
}
