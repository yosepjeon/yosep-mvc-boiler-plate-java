package com.yosep.server.restdoc.application.command.data.dto;


import com.yosep.server.restdoc.application.command.data.vo.RestDocVo1;
import java.util.Collections;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;

@Getter
@Builder
public class RestDocCommandDto1 extends RepresentationModel<RestDocCommandDto1> {

	private final String name;
	private final Long longValue1;
	private final List<RestDocVo1> restDocVo1List;

	public RestDocCommandDto1(String name, Long longValue1, List<RestDocVo1> restDocVo1List) {
		this.name = name;
		this.longValue1 = longValue1;
		this.restDocVo1List = Collections.unmodifiableList(restDocVo1List);
	}
}
