package com.rpae.common_lib.DTOs.history;

import java.util.List;

import lombok.Data;

@Data
public class HistoryQueryResponse {
	private List<PriceHistoryRecord> prices;
	private List<AlertHistoryRecord> alerts;
	private List<NotificationHistoryRecord> notifications;
}
