package com.rpae.notification_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notification_logs")
public class NotificationLog {
	@Id
	private String id; // UUID

	private String userId;
	private String alertId;
	private String symbol;

	private String channel; // EMAIL/SMS/WHATSAPP
	private boolean success;
	private String errorMessage;

	private long timestamp;
}
