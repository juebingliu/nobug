package com.dbpf.nobug.config.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author juebing
 * @version v1.0
 * @date 2019/5/16 16:49
 * @description
 */
@Configuration
@MapperScan(basePackages = "com.dbpf.nobug.database.mapper")
public class MyBatisConfig {

    @Autowired
    private Environment environment;

    @Bean(name = "datasource")
    @Qualifier("datasource")
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(@Qualifier("datasource") DataSource dataSource) throws Exception{
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        fb.setDataSource(dataSource);
        fb.setTypeAliasesPackage(environment.getProperty("mybatis.type-aliases-package"));
        fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(environment.getProperty("mybatis.mapper-locations")));
//        fb.setPlugins(new Interceptor[]{new SqlCostInterceptor()});
        return fb.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager(@Qualifier("datasource") DataSource dataSource) throws Exception {
        return new DataSourceTransactionManager(dataSource);
    }
}