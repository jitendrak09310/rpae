package com.rpae.common_lib.DTOs.alert;

import lombok.Data;

@Data
public class UserAlertDTO {
	private String userEmail;
	private String symbol;
	private Double upperLimit;
	private Double lowerLimit;
	private Boolean active = true;
}
