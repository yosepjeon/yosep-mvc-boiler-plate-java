package com.yosep.server.restdoc.api.query.data.assembler;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

import com.yosep.server.restdoc.api.query.RestDocQueryController;
import com.yosep.server.restdoc.api.query.data.vo.RestDocGetElements1;
import com.yosep.server.restdoc.application.query.data.vo.RestDocVo1;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class RestDocGetElements1Assembler implements RepresentationModelAssembler<RestDocVo1, EntityModel<RestDocGetElements1>> {

	@Override
	public EntityModel<RestDocGetElements1> toModel(RestDocVo1 entity) {
		return EntityModel.of(RestDocGetElements1.from(entity));
	}

	@Override
	public CollectionModel<EntityModel<RestDocGetElements1>> toCollectionModel(
		Iterable<? extends RestDocVo1> entities) {
		return RepresentationModelAssembler.super.toCollectionModel(entities)
			.add(linkTo(RestDocQueryController.class).withSelfRel());
	}
}
