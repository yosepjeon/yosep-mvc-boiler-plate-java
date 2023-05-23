package com.yosep.server.restdoc.api.query.data.request;

import lombok.Getter;

@Getter
public class RestDocGetRequest1 {
	private final String id;
	private final Long longValue;

	public RestDocGetRequest1() {
		this.id = "";
		this.longValue = null;
	}

	public RestDocGetRequest1(String id, Long longValue) {
		this.id = id;
		this.longValue = longValue;
	}
}
