package com.yosep.server.restdoc.api.command.data.request;

import lombok.Getter;

@Getter
public class RestDocPostRequest1 {
	private final String id;
	private final Long longValue;

	public RestDocPostRequest1(String id, Long longValue) {
		this.id = id;
		this.longValue = longValue;
	}
}
