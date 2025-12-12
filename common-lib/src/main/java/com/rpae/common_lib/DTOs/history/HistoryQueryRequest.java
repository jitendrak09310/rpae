package com.rpae.common_lib.DTOs.history;

import lombok.Data;

@Data
public class HistoryQueryRequest {
	private String userId;
	private String alertId;
	private String symbol;
	private Long startTime;
	private Long endTime;
}
