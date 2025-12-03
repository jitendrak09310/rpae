package com.rpae.common_lib.DTOs.user;

import lombok.Data;

@Data
public class LinkUserAlertRequest {
	private String userId;
	private String alertId;
}
