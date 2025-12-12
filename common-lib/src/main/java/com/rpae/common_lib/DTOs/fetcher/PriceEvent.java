package com.rpae.common_lib.DTOs.fetcher;

import lombok.Data;

@Data
public class PriceEvent {
	private String symbol;
	private double price;
	private String sourceName;
	private long timestamp;
}