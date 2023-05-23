package com.yosep.server.restdoc.application.query.data.dto;

import com.yosep.server.restdoc.application.query.data.vo.RestDocVo1;
import java.util.List;
import lombok.Builder;

@Builder
public record RestDocGetDto1(

	String name,
	long longValue1,
	List<RestDocVo1> restDocVo1List
) {

}
