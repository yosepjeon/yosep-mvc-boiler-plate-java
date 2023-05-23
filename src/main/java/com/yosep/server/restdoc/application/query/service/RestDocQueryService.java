package com.yosep.server.restdoc.application.query.service;

import com.yosep.server.restdoc.application.query.data.dto.RestDocGetDto1;
import com.yosep.server.restdoc.application.query.data.vo.RestDocVo1;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RestDocQueryService {

	public RestDocGetDto1 method1(String id) {
		RestDocVo1 restDocVo1 = RestDocVo1.builder()
			.voStringValue1("voStringValue1")
			.voDoubleValue1(1.2)
			.voIntValue1(100)
			.build();

		List<RestDocVo1> restDocVo1List = Arrays.asList(restDocVo1);

		return RestDocGetDto1.builder()
			.name("name")
			.longValue1(100)
			.restDocVo1List(restDocVo1List)
			.build();
	}
}
