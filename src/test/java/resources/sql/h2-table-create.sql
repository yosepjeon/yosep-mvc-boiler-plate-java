create table kakaopay_sec_stock_daily_history
(
    id              bigint auto_increment comment 'id' primary key,
    stock_code      bigint unsigned                    not null comment '종목 코드',
    stock_name      varchar(40)                        not null comment '종목 이름',
    stock_price     bigint                             not null comment '주가',
    final_volume    bigint                             null comment '최종 거래량',
    total_views     bigint                             null comment '누적 조회수',
    update_operator varchar(20)                        null comment '수정자',
    update_time     datetime default CURRENT_TIMESTAMP not null comment '변경일시',
    insert_operator varchar(20)                        null comment '등록자',
    insert_time     datetime default CURRENT_TIMESTAMP not null comment '등록일시'
) charset = utf8;