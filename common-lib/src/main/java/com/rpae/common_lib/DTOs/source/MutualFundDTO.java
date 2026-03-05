package com.rpae.common_lib.DTOs.source;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MutualFundDTO {

	@JsonProperty("fund_name")
	private String fundName;
	@JsonProperty("latest_nav")
	private Double latestNav;
	@JsonProperty("percentage_change")
	private Double percentageChange;
	@JsonProperty("asset_size")
	private Double assetSize;
	@JsonProperty("1_month_return")
	private Double oneMonthReturn;
	@JsonProperty("3_month_return")
	private Double threeMonthReturn;
	@JsonProperty("6_month_return")
	private Double sixMonthReturn;
	@JsonProperty("1_year_return")
	private Double oneYearReturn;
	@JsonProperty("3_year_return")
	private Double threeYearReturn;
	@JsonProperty("5_year_return")
	private Double fiveYearReturn;
	@JsonProperty("star_rating")
	private Integer starRating;
}