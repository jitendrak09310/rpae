package com.rpae.common_lib.DTOs.source;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CryptoCoinDTO {

	private String id;
	private String symbol;
	private String name;
	private String image;
	@JsonProperty("current_price")
	private Long currentPrice;
	@JsonProperty("high_24h")
	private Long high24h;
	@JsonProperty("low_24h")
	private Long low24h;
	@JsonProperty("atl")
	private Long allTimeLow;

}
