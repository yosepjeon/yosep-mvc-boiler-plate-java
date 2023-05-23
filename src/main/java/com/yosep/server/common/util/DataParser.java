package com.yosep.server.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
@RequiredArgsConstructor
public class DataParser {

	private final ObjectMapper objectMapper;

	public <R> R parse(byte[] data, Class<R> clazz) {
		try {
			return objectMapper.readValue(data, clazz);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public <T, R> R parse(T data, Class<R> clazz) {
		return objectMapper.convertValue(data, clazz);
	}

	public <T> byte[] parse(T data) {
		try {
			return objectMapper.writeValueAsBytes(data);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public <T> byte[] parseObjectToByte(T data) {
		try {
			return ObjectUtils.isEmpty(data) ? null : objectMapper.writeValueAsBytes(data);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public <T> String parseObjectToString(T data) {
		try {
			return ObjectUtils.isEmpty(data) ? null : objectMapper.writeValueAsString(data);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}

	public <T> T convertData(Object data, Class<T> clazz) {
		try {
			return objectMapper.convertValue(data, clazz);
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
