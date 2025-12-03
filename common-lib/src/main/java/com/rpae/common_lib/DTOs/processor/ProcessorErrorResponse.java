package com.rpae.common_lib.DTOs.processor;

import lombok.Data;

@Data
public class ProcessorErrorResponse {
	private String message;
	private long timestamp;
}
