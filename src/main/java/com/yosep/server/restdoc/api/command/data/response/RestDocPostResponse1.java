package com.yosep.server.restdoc.api.command.data.response;

import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;

@Getter
public class RestDocPostResponse1 extends RepresentationModel<RestDocPostResponse1> {

	private final int intValue;
	private final String stringValue;

	public RestDocPostResponse1() {
		this.intValue = 0;
		this.stringValue = "";
	}

	public RestDocPostResponse1(int intValue, String stringValue) {
		this.intValue = intValue;
		this.stringValue = stringValue;
	}
}
