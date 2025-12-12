package com.rpae.common_lib.DTOs.notification;

import lombok.Data;

@Data
public class SmsMessage {
	private String phoneNumber;
	private String text;
}
