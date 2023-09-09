package com.yosep.server.jpa.dao.jpa.read.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.yosep.server.database.dao.mysql.jpa.read.repository.StockDailyHistoryRepository;
import com.yosep.server.database.domain.StockDailyHistoryEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class StockDailyHistoryRepositoryTest {

	@Autowired
	StockDailyHistoryRepository stockDailyHistoryRepository;

	@Test
	@DisplayName("ID 1로 주식정보 가져오기 테스트 성공")
	void findById_id1IsExist_success() {
		// given

		// when
		StockDailyHistoryEntity entity = stockDailyHistoryRepository.findById(1L).get();

		// then
		assertEquals("삼성전자",  entity.getStockName());
	}
}