package com.rpae.user_service.Entity;

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
@Table(name = "users")
public class User {

	@Id
	private String userId; // UUID

	private String name;
	private String email;
	private String phoneNumber;

	private boolean emailNotifications;
	private boolean smsNotifications;
	private boolean whatsappNotifications;

	private long createdAt;
}
