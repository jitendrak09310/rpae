package com.rpae.common_lib.DTOs.fetcher;

import lombok.Data;

@Data
public class FetcherErrorResponse {
	private String sourceName;
	private String symbol;
	private String message;
	private long timestamp;
}
