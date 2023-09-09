package com.yosep.server.database.dao.mysql.jpa.read.repository;

import com.yosep.server.database.domain.StockDailyHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockDailyHistoryRepository extends JpaRepository<StockDailyHistoryEntity, Long> {

}
