package com.rpae.common_lib.DTOs.user;

import java.util.List;

import lombok.Data;

@Data
public class UserAlertMappingResponse {
	private String userId;
	private List<String> alertIds;
}
