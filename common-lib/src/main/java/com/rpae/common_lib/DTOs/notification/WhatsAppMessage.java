package com.rpae.common_lib.DTOs.notification;

import lombok.Data;

@Data
public class WhatsAppMessage {
	private String phoneNumber;
	private String text;
}
