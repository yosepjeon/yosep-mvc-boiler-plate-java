package com.yosep.server.restdoc.application.command.service;

import com.yosep.server.restdoc.api.command.data.request.RestDocPostRequest1;
import com.yosep.server.restdoc.application.command.data.dto.RestDocCommandDto1;
import com.yosep.server.restdoc.application.command.data.vo.RestDocVo1;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RestDocCommandService {

	public RestDocCommandDto1 method1(RestDocPostRequest1 request) {
		RestDocVo1 restDocVo1 = RestDocVo1.builder()
			.voStringValue1("voStringValue1")
			.voDoubleValue1(1.2)
			.voIntValue1(100)
			.build();

		List<RestDocVo1> restDocVo1List = Arrays.asList(restDocVo1);

		return RestDocCommandDto1.builder()
			.name("name")
			.longValue1(100L)
			.restDocVo1List(restDocVo1List)
			.build();
	}
}
