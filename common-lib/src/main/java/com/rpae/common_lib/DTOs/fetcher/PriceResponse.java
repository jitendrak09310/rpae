package com.rpae.common_lib.DTOs.fetcher;

import lombok.Data;

@Data
public class PriceResponse {
	private String sourceName;
	private String symbol;
	private double price;
	private long timestamp;
}
