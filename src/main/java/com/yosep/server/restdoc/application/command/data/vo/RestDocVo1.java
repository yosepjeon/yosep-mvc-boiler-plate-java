package com.yosep.server.restdoc.application.command.data.vo;

import lombok.Builder;

@Builder
public record RestDocVo1 (
	String voStringValue1,
	double voDoubleValue1,
	int voIntValue1
) {
}
