package com.yosep.server.database.domain;

import com.yosep.server.common.db.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "stock_daily_history")
@Entity
@Data
public class StockDailyHistoryEntity extends BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "stock_code")
    private String stockCode;  // 종목 코드

    @Column(name = "stock_name")
    private String stockName; // 종목이름

    @Column(name = "stock_price")
    private long stockPrice;  // 주가

    @Column(name = "final_volume")
    private long finalVolume;  // 최종 거래량

    @Column(name = "total_views")
    private long totalViews;  // 누적 조회수
}