package com.rpae.common_lib.DTOs.processor;

import lombok.Data;

@Data
public class RuleEvaluationResult {
	private boolean triggered;
	private String alertId;
	private String userId;
	private String symbol;
	private double price;
	private double threshold;
	private String condition;
	private long timestamp;
}
