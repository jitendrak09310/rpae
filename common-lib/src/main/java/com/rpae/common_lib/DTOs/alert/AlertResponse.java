package com.rpae.common_lib.DTOs.alert;

import lombok.Data;

@Data
public class AlertResponse {
	private String alertId;
	private String userId;
	private String symbol;
	private double threshold;
	private String condition;
	private boolean active;
	private long createdAt;
}
