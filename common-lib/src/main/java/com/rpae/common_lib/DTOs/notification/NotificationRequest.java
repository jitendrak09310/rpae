package com.rpae.common_lib.DTOs.notification;

import lombok.Data;

@Data
public class NotificationRequest {
	private String userId;
	private String alertId;
	private String symbol;
	private double price;
	private String condition;
	private double threshold;
	private long timestamp;
}
