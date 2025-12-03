package com.rpae.common_lib.DTOs.source;

import lombok.Data;

@Data
public class CreateSourceRequest {

	private String sourceName;
	private String baseUrl;
	private Boolean active;

}
