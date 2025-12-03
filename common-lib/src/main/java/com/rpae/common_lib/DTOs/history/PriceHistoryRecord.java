package com.rpae.common_lib.DTOs.history;

import lombok.Data;

@Data
public class PriceHistoryRecord {
	private String id;
	private String symbol;
	private double price;
	private String sourceName;
	private long timestamp;
}
