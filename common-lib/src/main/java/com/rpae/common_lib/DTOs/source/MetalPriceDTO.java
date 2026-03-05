package com.rpae.common_lib.DTOs.source;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MetalPriceDTO {

	private String symbol;
	private String name;
	private String updatedAt;
	@JsonProperty("price")
	private BigDecimal price;

}
