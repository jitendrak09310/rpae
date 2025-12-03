package com.rpae.common_lib.DTOs.alert;

import lombok.Data;

@Data
public class AlertRequest {
	private String userId;
	private String symbol; // BTCUSDT
	private double threshold; // e.g. 65000
	private String condition;

}
