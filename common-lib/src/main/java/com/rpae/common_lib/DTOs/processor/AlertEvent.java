package com.rpae.common_lib.DTOs.processor;

import lombok.Data;

@Data
public class AlertEvent {
	private String alertId;
	private String userId;
	private String symbol;
	private double price;
	private String condition;
	private double threshold;
	private long timestamp;

}
