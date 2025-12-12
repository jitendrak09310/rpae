package com.rpae.common_lib.DTOs.alert;

import lombok.Data;

@Data
public class UpdateAlertRequest {
	private String alertId;
	private double threshold;
	private String condition;
	private boolean active;
}
