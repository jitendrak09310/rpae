package com.rpae.common_lib.DTOs.fetcher;

import lombok.Data;

@Data
public class PriceFetchRequest {
	private String sourceName; // e.g. "BINANCE"
	private String symbol; // e.g. "BTCUSDT"

}
