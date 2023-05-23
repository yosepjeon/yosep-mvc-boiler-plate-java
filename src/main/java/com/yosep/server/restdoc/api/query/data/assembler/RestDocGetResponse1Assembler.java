package com.yosep.server.restdoc.api.query.data.assembler;

import com.yosep.server.restdoc.api.query.data.response.RestDocGetResponse1;
import com.yosep.server.restdoc.application.query.data.dto.RestDocGetDto1;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class RestDocGetResponse1Assembler implements RepresentationModelAssembler<RestDocGetDto1, EntityModel<RestDocGetResponse1>> {

	@Override
	public EntityModel<RestDocGetResponse1> toModel(RestDocGetDto1 entity) {
		return EntityModel.of(RestDocGetResponse1.from(entity));
	}

	@Override
	public CollectionModel<EntityModel<RestDocGetResponse1>> toCollectionModel(
		Iterable<? extends RestDocGetDto1> entities) {
		return RepresentationModelAssembler.super.toCollectionModel(entities);
	}
}
