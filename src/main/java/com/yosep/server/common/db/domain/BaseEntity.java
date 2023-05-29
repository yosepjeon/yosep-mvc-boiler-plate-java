package com.yosep.server.common.db.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseEntity {

    @CreatedBy
    @Column(name = "insert_operator", updatable = false)
    protected String insertOperator;

    @LastModifiedBy
    @Column(name = "update_operator")
    protected String updateOperator;

    @CreatedDate
    @Column(name = "insert_time", updatable = false)
    protected LocalDateTime insertTime;

    @LastModifiedDate
    @Column(name = "update_time")
    protected LocalDateTime updateTime;
}