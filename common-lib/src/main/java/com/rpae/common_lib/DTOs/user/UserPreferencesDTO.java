package com.rpae.common_lib.DTOs.user;

import lombok.Data;

@Data
public class UserPreferencesDTO {
	private String userId;
	private String email;
	private String phoneNumber;
	private boolean emailNotifications;
	private boolean smsNotifications;
	private boolean whatsappNotifications;
}
