package com.yosep.server.jpa.application.query;

import com.yosep.server.jpa.dao.mysql.jpa.read.repository.StockDailyHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class JpaStudyQueryService {

	private final StockDailyHistoryRepository stockDailyHistoryRepository;

	
}
