//package com.yosep.server.common.config;
//
//import javax.sql.DataSource;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
//
//public class TestH2Config {
//
//    public DataSource amsDefaultDataSource() {
//        return new EmbeddedDatabaseBuilder()
//            .setName("yosep;mode=MySQL")
//            .setType(EmbeddedDatabaseType.H2)
//            .addScript("classpath:sql/ams-h2.sql")
//            .addScript("classpath:sql/ams-h2-data.sql")
//            .build();
//    }
//
//    public JdbcTemplate testJdbcTemplate() {
//        return new JdbcTemplate(amsDefaultDataSource());
//    }
//
//    public NamedParameterJdbcTemplate testNamedParameterJdbcTemplate() {
//        return new NamedParameterJdbcTemplate(amsDefaultDataSource());
//    }
//}
