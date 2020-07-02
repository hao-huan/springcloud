package com.macro.cloud.config;

import com.alibaba.druid.pool.DruidDataSource;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;

import io.seata.rm.datasource.DataSourceProxy;
import io.seata.spring.annotation.GlobalTransactionScanner;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;

//@Configuration
public class DataSourceProxyConfig {

	@Value("${mybatis.mapperLocations}")
	private String mapperLocations;


	@Autowired(required=true)
	private DataSourceProperties dataSourceProperties;

	@Bean
	@Primary 
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource druidDataSource(){
		/*
		System.out.println("===== dataSource ==");
		System.out.println("this.mapperLocations : " + this.mapperLocations ); 
  		DruidDataSource druidDataSource =  new DruidDataSource();
		String url = dataSourceProperties.getUrl();
		String username = dataSourceProperties.getUsername();
		String password = dataSourceProperties.getPassword();
		String driverClassName = dataSourceProperties.getDriverClassName();
		
		druidDataSource.setUrl(url);
		druidDataSource.setUsername(username);
		druidDataSource.setPassword(password);
		druidDataSource.setDriverClassName(driverClassName);

		druidDataSource.setInitialSize(0);
		druidDataSource.setMaxActive(180);
		druidDataSource.setMaxWait(60000);
		druidDataSource.setMinIdle(0);
		druidDataSource.setValidationQuery("select 1");
		druidDataSource.setTestOnBorrow(false);
		druidDataSource.setTestOnReturn(false);
		druidDataSource.setTestWhileIdle(true);
		druidDataSource.setTimeBetweenEvictionRunsMillis(60000); 
		druidDataSource.setMinEvictableIdleTimeMillis(25200000);
		druidDataSource.setRemoveAbandoned(true);
		druidDataSource.setRemoveAbandonedTimeout(1800);
		druidDataSource.setLogAbandoned(true);

		return new DataSourceProxy(druidDataSource);
		*/
		return new DruidDataSource();
	}


	/*
	@Bean 
	public GlobalTransactionScanner globalTransactionScanner(){
	    return new GlobalTransactionScanner("test-service", "test-group");
	}
	*/ 

	/*
	@Bean
	public DataSourceProxy dataSourceProxy(DataSource dataSource) {
		return new DataSourceProxy(dataSource);
	}*/ 

	
	//SqlSessionFactory
	/*
	   @Bean
	   public SqlSessionFactory sqlSessionFactoryBean(DataSourceProxy dataSourceProxy) throws Exception {
	//   MybatisSqlSessionFactoryBean  sqlSessionFactoryBean= new  MybatisSqlSessionFactoryBean();
       		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSourceProxy);
		sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));
		sqlSessionFactoryBean.setTransactionFactory(new SpringManagedTransactionFactory());
	       return sqlSessionFactoryBean.getObject();
	   }
	   */ 
	    
	   


	
	//@Bean
	//public MybatisSqlSessionFactoryBean sqlSessionFactoryBean(DataSourceProxy dataSourceProxy) throws Exception {
	   /*	
		MybatisSqlSessionFactoryBean  sqlSessionFactoryBean= new  MybatisSqlSessionFactoryBean();
		//       SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSourceProxy);
		sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
				.getResources(mapperLocations));
		sqlSessionFactoryBean.setTransactionFactory(new SpringManagedTransactionFactory());
		return sqlSessionFactoryBean.getObject(); 
           */

/*
		MybatisSqlSessionFactoryBean mybatisPlus = new MybatisSqlSessionFactoryBean();
		mybatisPlus.setDataSource(dataSourceProxy);
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
		return mybatisPlus;*/ 
	//	return null; 


	//}

}
