package com.yosep.server.common.db.config;

import com.yosep.server.common.db.EntityManagerFactory;
import java.util.Objects;
import javax.sql.DataSource;
import lombok.RequiredArgsConstructor;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.SpringBeanContainer;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@RequiredArgsConstructor
@EnableTransactionManagement
@EnableJpaRepositories(
	entityManagerFactoryRef = "yosepReadEntityManager",
	transactionManagerRef = "yosepReadTransactionManager",
	basePackages = {
		"com.yosep.server.jpa.dao.mysql.jpa.read.*"
	}
)
public class YosepReadDataSourceConfig {

	private final EntityManagerFactory entityManagerFactory;

	private static final String[] YOSEP_READ_PACKAGE_NAME = {
		"com.yosep.server.jpa.domain"
	};

	@Bean
	@Primary
	public LocalContainerEntityManagerFactoryBean yosepReadEntityManager(
		@Qualifier("yosepReadDataSource") DataSource dataSource,
		ConfigurableListableBeanFactory beanFactory
	) {
		LocalContainerEntityManagerFactoryBean build = entityManagerFactory.getEntityManger(dataSource, YOSEP_READ_PACKAGE_NAME);
		build.getJpaPropertyMap().put(AvailableSettings.BEAN_CONTAINER, new SpringBeanContainer(beanFactory));

		return build;
	}

	@Bean
	@Primary
	public PlatformTransactionManager yosepReadTransactionManager(
		@Qualifier("yosepReadEntityManager") LocalContainerEntityManagerFactoryBean entityManager
	) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(Objects.requireNonNull(entityManager.getObject()));
		return transactionManager;
	}
}
