package com.yosep.server.restdoc.api.query;

import com.yosep.server.common.util.DataParser;
import com.yosep.server.restdoc.api.query.data.assembler.RestDocGetResponse1Assembler;
import com.yosep.server.restdoc.api.query.data.response.RestDocGetResponse1;
import com.yosep.server.restdoc.application.query.service.RestDocQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/restdoc-study")
@RequiredArgsConstructor
public class RestDocQueryController {

	private final RestDocQueryService restDocQueryService;

	private final RestDocGetResponse1Assembler restDocGetResponse1Assembler;
	private final DataParser dataParser;

	@GetMapping(value = "/credit-api")
	public ResponseEntity<EntityModel<RestDocGetResponse1>> get1(@RequestParam("id") String id) {
		EntityModel<RestDocGetResponse1> restDocGetResponse1 = restDocGetResponse1Assembler.toModel(restDocQueryService.method1(id));

		return ResponseEntity.ok(restDocGetResponse1);
	}

}
