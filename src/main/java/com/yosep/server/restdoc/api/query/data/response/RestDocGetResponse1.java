package com.yosep.server.restdoc.api.query.data.response;

import com.yosep.server.restdoc.api.query.data.assembler.RestDocGetElements1Assembler;
import com.yosep.server.restdoc.api.query.data.vo.RestDocGetElement1;
import com.yosep.server.restdoc.application.query.data.dto.RestDocGetDto1;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@Getter
@Builder
@ToString
@Relation(value = "response")
public class RestDocGetResponse1 extends RepresentationModel<RestDocGetResponse1> {

	private static final RestDocGetElements1Assembler restDocGetElements1Assembler = new RestDocGetElements1Assembler();

	private final String name;
	private final long longValue1;
	private final CollectionModel<EntityModel<RestDocGetElement1>> restDocVo1List;

	public RestDocGetResponse1() {
		this.name = "";
		this.longValue1 = 0;
		this.restDocVo1List = CollectionModel.empty();
	}

	public RestDocGetResponse1(String name, long longValue1,
		CollectionModel<EntityModel<RestDocGetElement1>> restDocVo1List) {
		this.name = name;
		this.longValue1 = longValue1;
		this.restDocVo1List = restDocVo1List;
	}

	public static RestDocGetResponse1 from(RestDocGetDto1 restDocGetDto1) {

		return new RestDocGetResponse1(
			restDocGetDto1.name(),
			restDocGetDto1.longValue1(),
			restDocGetElements1Assembler.toCollectionModel(restDocGetDto1.restDocVo1List())
		);
	}
}
