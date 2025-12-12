package com.rpae.notification_service.controller;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpae.common_lib.DTOs.notification.PriceDTO;
import com.rpae.notification_service.service.NotificationService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/notify")
@RequiredArgsConstructor
@Slf4j
public class NotificationController {

	private final NotificationService notificationService;

	@PostMapping("/sendNotification")
	public void sendNotification(@RequestBody PriceDTO priceDto) {
		notificationService.sendNotification(priceDto);
	}

}
