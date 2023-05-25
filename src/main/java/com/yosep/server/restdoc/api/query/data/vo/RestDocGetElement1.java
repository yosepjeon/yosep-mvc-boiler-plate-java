package com.yosep.server.restdoc.api.query.data.vo;

import com.yosep.server.restdoc.application.query.data.vo.RestDocVo1;
import lombok.Builder;
import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@Getter
@Builder
@Relation(value = "element", collectionRelation = "elementList")
public class RestDocGetElement1 extends RepresentationModel<RestDocGetElement1> {

	private final String voStringValue1;
	private final double voDoubleValue1;
	private final int voIntValue1;

	public RestDocGetElement1() {
		this.voStringValue1 = "";
		this.voDoubleValue1 = 0;
		this.voIntValue1 = 0;
	}

	public RestDocGetElement1(String voStringValue1, double voDoubleValue1, int voIntValue1) {

		this.voStringValue1 = voStringValue1;
		this.voDoubleValue1 = voDoubleValue1;
		this.voIntValue1 = voIntValue1;
	}

	public RestDocGetElement1(RestDocVo1 restDocVo1) {
		this.voStringValue1 = restDocVo1.voStringValue1();
		this.voDoubleValue1 = restDocVo1.voDoubleValue1();
		this.voIntValue1 = restDocVo1.voIntValue1();
	}

	public static RestDocGetElement1 from(RestDocVo1 restDocVo1) {
		return new RestDocGetElement1(
			restDocVo1.voStringValue1(),
			restDocVo1.voDoubleValue1(),
			restDocVo1.voIntValue1()
		);
	}
}
