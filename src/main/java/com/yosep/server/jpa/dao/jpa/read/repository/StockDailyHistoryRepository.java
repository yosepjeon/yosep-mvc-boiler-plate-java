package com.yosep.server.jpa.dao.jpa.read.repository;

import com.yosep.server.jpa.domain.StockDailyHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface StockDailyHistoryRepository extends JpaRepository<StockDailyHistoryEntity, Long> {

}
