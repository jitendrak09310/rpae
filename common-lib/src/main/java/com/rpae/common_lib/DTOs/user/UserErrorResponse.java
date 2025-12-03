package com.rpae.common_lib.DTOs.user;

import lombok.Data;

@Data
public class UserErrorResponse {
	private String message;
	private long timestamp;
}
