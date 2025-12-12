package com.rpae.processor_service.model;

import lombok.Data;

@Data
public class PriceDTO {

	private String sourceName;
	private String symbol;
	private Double price;
	private Long timestamp;

}
