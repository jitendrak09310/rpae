package com.rpae.common_lib.DTOs.processor;

import lombok.Data;

@Data
public class RuleDefinition {
	private String userId;
	private String alertId;
	private String symbol;
	private double threshold;
	private String condition; // ABOVE / BELOW / EQUAL
}
