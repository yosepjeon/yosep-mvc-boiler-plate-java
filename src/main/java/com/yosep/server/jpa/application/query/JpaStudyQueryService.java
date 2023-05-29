package com.yosep.server.jpa.application.query;

import com.yosep.server.jpa.dao.jpa.read.repository.StockDailyHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JpaStudyQueryService {

	private final StockDailyHistoryRepository stockDailyHistoryRepository;
}
