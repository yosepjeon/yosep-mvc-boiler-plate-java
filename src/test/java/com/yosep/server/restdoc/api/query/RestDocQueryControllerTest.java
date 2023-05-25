package com.yosep.server.restdoc.api.query;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessRequest;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessResponse;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yosep.server.common.util.DataParser;
import com.yosep.server.restdoc.api.query.data.assembler.RestDocGetResponse1Assembler;
import com.yosep.server.restdoc.api.query.data.response.RestDocGetResponse1;
import com.yosep.server.restdoc.application.query.data.dto.RestDocGetDto1;
import com.yosep.server.restdoc.application.query.data.vo.RestDocVo1;
import com.yosep.server.restdoc.application.query.service.RestDocQueryService;
import java.util.Arrays;
import java.util.List;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.hateoas.EntityModel;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.restdocs.operation.preprocess.Preprocessors;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureRestDocs
@WebMvcTest(RestDocQueryController.class)
class RestDocQueryControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private RestDocQueryService restDocQueryService;
	@MockBean
	private RestDocGetResponse1Assembler restDocGetResponse1Assembler;
	@MockBean
	private DataParser dataParser;

	@Test
	@DisplayName("reqeust가 정상 존재시 성공")
	void get1_requestIsValid_success() throws Exception {
		// given
		DataParser dataParser1 = new DataParser(new ObjectMapper());
		String responseMockString = "{\n"
			+ "    \"name\": \"name\",\n"
			+ "    \"longValue1\": 100,\n"
			+ "    \"restDocVo1List\": {\n"
			+ "        \"_embedded\": {\n"
			+ "            \"elementList\": [\n"
			+ "                {\n"
			+ "                    \"voStringValue1\": \"voStringValue1\",\n"
			+ "                    \"voDoubleValue1\": 1.2,\n"
			+ "                    \"voIntValue1\": 100,\n"
			+ "                    \"_links\": {\n"
			+ "                        \"self\": {\n"
			+ "                            \"href\": \"http://localhost:10000/restdoc-study\"\n"
			+ "                        }\n"
			+ "                    }\n"
			+ "                }\n"
			+ "            ]\n"
			+ "        }\n"
			+ "    },\n"
			+ "    \"_links\": {\n"
			+ "        \"self\": {\n"
			+ "            \"href\": \"http://localhost:10000/restdoc-study\"\n"
			+ "        }\n"
			+ "    }\n"
			+ "}";

		EntityModel<RestDocGetResponse1> entityModel = dataParser1.parse(responseMockString,
			EntityModel.class);
		given(restDocGetResponse1Assembler.toModel(any()))
			.willReturn(entityModel);

		// when & then
		mockMvc.perform(MockMvcRequestBuilders.get("/restdoc-study/credit-api").param("id", "1"))
			.andDo(print())
			.andDo(document("restdoc-study/credit-api",
				preprocessRequest(prettyPrint()),
				preprocessResponse(prettyPrint())))
			.andExpect(status().isOk())
			.andExpect(content().json(responseMockString));
	}
}