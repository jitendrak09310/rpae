package com.rpae.common_lib.DTOs.notification;

import lombok.Data;

@Data
public class NotificationChannelRequest {
	private String email;
	private String phoneNumber;
	private boolean emailEnabled;
	private boolean smsEnabled;
	private boolean whatsappEnabled;
}
