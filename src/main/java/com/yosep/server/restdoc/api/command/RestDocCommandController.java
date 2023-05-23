package com.yosep.server.restdoc.api.command;

import com.yosep.server.restdoc.api.command.data.request.RestDocPostRequest1;
import com.yosep.server.restdoc.application.command.service.RestDocCommandService;
import com.yosep.server.restdoc.application.command.data.dto.RestDocCommandDto1;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/restdoc-study")
@RequiredArgsConstructor
public class RestDocCommandController {

	private final RestDocCommandService restDocCommandService;

	@PostMapping(value = "/create-api/{id}")
	public ResponseEntity<RestDocCommandDto1> createApi(
		@RequestHeader(value = "X-Auth-Token", required = true) String authToken,
		@PathVariable(value = "id") String id,
		@RequestBody RestDocPostRequest1 request
	) {
		RestDocCommandDto1 responseDto = restDocCommandService.method1(request);

		return ResponseEntity.ok(responseDto);
	}
}
