package com.yosep.server.restdoc.api.command.data.vo;

import java.util.Collections;
import java.util.List;

public class RestDocPostElements1 {
	private final List<String> elements;

	public RestDocPostElements1() {
		this.elements = Collections.emptyList();
	}

	public RestDocPostElements1(List<String> elements) {
		this.elements = elements;
	}

	public List<String> getElements() {
		return Collections.unmodifiableList(this.elements);
	}
}
