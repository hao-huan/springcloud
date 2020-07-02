package com.macro.cloud.config;

import com.baomidou.mybatisplus.core.MybatisConfiguration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.plugin.Interceptor;

import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;

import org.springframework.context.annotation.Configuration;

import org.springframework.core.io.ResourceLoader;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan({"com.macro.cloud.dao"})
public class MyBatisConfig {

/*
	@Autowired
	private DataSource dataSource;

	@Autowired
	private MybatisProperties properties;

	@Autowired
	private ResourceLoader resourceLoader = new DefaultResourceLoader();

	@Autowired(required = false)
	private Interceptor[] interceptors;

	@Autowired(required = false)
	private DatabaseIdProvider databaseIdProvider;*/ 
//aa
	/**
	 *      *   mybatis-plus分页插件
	 *           */
/*	@Bean
	public PaginationInterceptor paginationInterceptor() {
		PaginationInterceptor page = new PaginationInterceptor();
		page.setDialectType("mysql");
		return page;
	}*/ 
	/**
	 *      * 这里全部使用mybatis-autoconfigure 已经自动加载的资源。不手动指定
	 *           * 配置文件和mybatis-boot的配置文件同步
	 *                * @return
	 *                     */
/*	@Bean
	public MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean() {
		MybatisSqlSessionFactoryBean mybatisPlus = new MybatisSqlSessionFactoryBean();
		mybatisPlus.setDataSource(dataSource);
		mybatisPlus.setVfs(SpringBootVFS.class);
		if (StringUtils.hasText(this.properties.getConfigLocation())) {
			mybatisPlus.setConfigLocation(this.resourceLoader.getResource(this.properties.getConfigLocation()));
		}
		mybatisPlus.setConfiguration(properties.getConfiguration());
		if (!ObjectUtils.isEmpty(this.interceptors)) {
			mybatisPlus.setPlugins(this.interceptors);
		}
		MybatisConfiguration mc = new MybatisConfiguration();
		mc.setDefaultScriptingLanguage(MybatisXMLLanguageDriver.class);
		mybatisPlus.setConfiguration(mc);
		if (this.databaseIdProvider != null) {
			mybatisPlus.setDatabaseIdProvider(this.databaseIdProvider);
		}
		if (StringUtils.hasLength(this.properties.getTypeAliasesPackage())) {
			mybatisPlus.setTypeAliasesPackage(this.properties.getTypeAliasesPackage());
		}
		if (StringUtils.hasLength(this.properties.getTypeHandlersPackage())) {
			mybatisPlus.setTypeHandlersPackage(this.properties.getTypeHandlersPackage());
		}
		if (!ObjectUtils.isEmpty(this.properties.resolveMapperLocations())) {
			mybatisPlus.setMapperLocations(this.properties.resolveMapperLocations());
		}
		return mybatisPlus;
	}*/ 


}
