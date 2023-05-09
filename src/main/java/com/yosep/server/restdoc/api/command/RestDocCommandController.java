package com.yosep.server.restdoc.api.command;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/restdoc-study")
public class RestDocCommandController {

  @PostMapping(value = "/create-api/{id}")
  public ResponseEntity<String> updateApi(
      @RequestHeader(value = "X-Auth-Token", required = true) String authToken,
      @PathVariable(value = "id") String id
  ) {

  }
}
