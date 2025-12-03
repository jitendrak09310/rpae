package com.rpae.common_lib.DTOs.history;

import lombok.Data;

@Data
public class AlertHistoryRecord {
	 private String id;
	    private String alertId;
	    private String userId;
	    private String symbol;
	    private double price;
	    private String condition;
	    private double threshold;
	    private long timestamp;
}
