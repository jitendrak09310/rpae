package com.rpae.common_lib.DTOs.alert;

import java.util.List;

import lombok.Data;

@Data
public class UserAlertListResponse {
	private String userId;
	private List<AlertResponse> alerts;
}
