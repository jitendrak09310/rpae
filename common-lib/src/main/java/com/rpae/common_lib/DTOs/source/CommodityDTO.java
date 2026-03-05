package com.rpae.common_lib.DTOs.source;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommodityDTO {

	@JsonProperty("id")
	private String id;
	@JsonProperty("messageTime")
	private String messageTime;
	@JsonProperty("product")
	private String product;
	@JsonProperty("expiry")
	private String expiry;
	@JsonProperty("product_month")
	private String productMonth;
	@JsonProperty("last_traded_price")
	private String lastTradedPrice;
	@JsonProperty("buy_price")
	private String buyPrice;
	@JsonProperty("sell_price")
	private String sellPrice;
	@JsonProperty("average_traded_price")
	private String averageTradedPrice;
	@JsonProperty("open_price")
	private String openPrice;
	@JsonProperty("high_price")
	private String highPrice;
	@JsonProperty("low_price")
	private String lowPrice;
	@JsonProperty("close_price")
	private String closePrice;
	@JsonProperty("buy_quantity")
	private String buyQuantity;
	@JsonProperty("sell_quantity")
	private String sellQuantity;
	@JsonProperty("last_traded_quantity")
	private String lastTradedQuantity;
	@JsonProperty("total_quantity_traded")
	private String totalQuantityTraded;
	@JsonProperty("change")
	private double change;
	@JsonProperty("per_change")
	private double perChange;
	@JsonProperty("open_interest")
	private String openInterest;
	@JsonProperty("open_interest_change")
	private long openInterestChange;
	@JsonProperty("open_interest_per_change")
	private double openInterestPerChange;
	@JsonProperty("oiResult")
	private String oiResult;
	@JsonProperty("last_traded_time")
	private String lastTradedTime;
	@JsonProperty("price_quotation_unit")
	private String priceQuotationUnit;
	@JsonProperty("quotation_lot")
	private String quotationLot;
}