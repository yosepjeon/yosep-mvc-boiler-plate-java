package com.yosep.server.restdoc.api.query.component;

import com.yosep.server.restdoc.api.command.data.response.RestDocPostResponse1;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Component;

@Component
public class RestDocResponseAssembler implements RepresentationModelAssembler<RestDocPostResponse1, EntityModel<RestDocPostResponse1>> {

	@Override
	public EntityModel<RestDocPostResponse1> toModel(RestDocPostResponse1 entity) {
		return EntityModel.of(entity);
	}

	@Override
	public CollectionModel<EntityModel<RestDocPostResponse1>> toCollectionModel(
		Iterable<? extends RestDocPostResponse1> entities) {
		return RepresentationModelAssembler.super.toCollectionModel(entities);
	}
}
