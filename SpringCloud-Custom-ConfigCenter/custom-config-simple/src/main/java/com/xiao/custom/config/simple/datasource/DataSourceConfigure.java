package com.xiao.custom.config.simple.datasource;

import lombok.extern.slf4j.Slf4j;

/**
 * [简要描述]: 初始化数据源
 * [详细描述]: RefreshScope标识需要刷新的数据
 *
 * @author llxiao
 * @version 1.0, 2019/1/30 09:09
 * @since JDK 1.8
 */
//@RefreshScope
//@Configuration
@Slf4j
public class DataSourceConfigure {
//    @Bean
//    @RefreshScope// 刷新配置文件
//    @Primary //Primary可以理解为默认优先选择,同时不可以同时设置多个
//    @ConfigurationProperties(prefix = "spring.datasource") // 数据源的自动配置的前缀
//    public DataSource dataSource()
//    {
//        return DataSourceBuilder.create().build();
//    }

    //    @Value("${spring.datasource.url}")
    //    private String dbUrl;
    //    @Value("${spring.datasource.username}")
    //    private String username;
    //    @Value("${spring.datasource.password}")
    //    private String password;
    //    @Value("${spring.datasource.driverClassName}")
    //    private String driverClassName;
    //    @Value("${spring.datasource.initialSize}")
    //    private int initialSize;
    //    @Value("${spring.datasource.minIdle}")
    //    private int minIdle;
    //    @Value("${spring.datasource.maxActive}")
    //    private int maxActive;
    //    @Value("${spring.datasource.maxWait}")
    //    private int maxWait;
    //    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
    //    private int timeBetweenEvictionRunsMillis;
    //    @Value("${spring.datasource.minEvictableIdleTimeMillis}")
    //    private int minEvictableIdleTimeMillis;
    //    @Value("${spring.datasource.validationQuery}")
    //    private String validationQuery;
    //    @Value("${spring.datasource.testWhileIdle}")
    //    private boolean testWhileIdle;
    //    @Value("${spring.datasource.testOnBorrow}")
    //    private boolean testOnBorrow;
    //    @Value("${spring.datasource.testOnReturn}")
    //    private boolean testOnReturn;
    //    @Value("${spring.datasource.poolPreparedStatements}")
    //    private boolean poolPreparedStatements;
    //    @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
    //    private int maxPoolPreparedStatementPerConnectionSize;
    //    @Value("${spring.datasource.filters}")
    //    private String filters;
    //    @Value("${spring.datasource.connectionProperties}")
    //    private String connectionProperties;
    //    @Value("${spring.datasource.useGlobalDataSourceStat}")
    //    private boolean useGlobalDataSourceStat;
    //
    //    @Bean     //声明其为Bean实例
    //    @Primary  //在同样的DataSource中，首先使用被标注的DataSource
    //    @RefreshScope
    //    public DataSource dataSource()
    //    {
    //        DruidDataSource datasource = new DruidDataSource();
    //        datasource.setUrl(this.dbUrl);
    //        datasource.setUsername(username);
    //        datasource.setPassword(password);
    //        datasource.setDriverClassName(driverClassName);
    //
    //        //configuration
    //        datasource.setInitialSize(initialSize);
    //        datasource.setMinIdle(minIdle);
    //        datasource.setMaxActive(maxActive);
    //        datasource.setMaxWait(maxWait);
    //        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
    //        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
    //        datasource.setValidationQuery(validationQuery);
    //        datasource.setTestWhileIdle(testWhileIdle);
    //        datasource.setTestOnBorrow(testOnBorrow);
    //        datasource.setTestOnReturn(testOnReturn);
    //        datasource.setPoolPreparedStatements(poolPreparedStatements);
    //        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
    //        datasource.setUseGlobalDataSourceStat(useGlobalDataSourceStat);
    //        try
    //        {
    //            datasource.setFilters(filters);
    //        }
    //        catch (SQLException e)
    //        {
    //            log.error("druid configuration initialization filter: " + e);
    //        }
    //        datasource.setConnectionProperties(connectionProperties);
    //        return datasource;
    //    }
}
