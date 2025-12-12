package com.rpae.common_lib.DTOs.processor;

import lombok.Data;

@Data
public class ProcessorRequest {
	private String symbol;
	private double price;
	private String sourceName;
	private long timestamp;
}
