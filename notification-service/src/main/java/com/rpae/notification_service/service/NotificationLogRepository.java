package com.rpae.notification_service.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpae.notification_service.model.NotificationLog;

public interface NotificationLogRepository extends JpaRepository<NotificationLog, String> {

}
