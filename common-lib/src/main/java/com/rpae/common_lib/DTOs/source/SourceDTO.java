package com.rpae.common_lib.DTOs.source;

import lombok.Data;

@Data
public class SourceDTO {

	private Long id;
	private String name;
	private String url;
	private String type;
	private Boolean active;

}
