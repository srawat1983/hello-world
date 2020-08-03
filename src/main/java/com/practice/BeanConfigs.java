package com.practice;

import com.practice.h2jdbc.example.H2JdbcExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@Configuration
public class BeanConfigs {


    @Bean
    public H2JdbcExample getH2JdbcExample(){
        return new H2JdbcExample();
    }

    @Autowired
    private DataSource dataSource;

    @Bean
    JdbcTemplate getTemplate() {
        System.out.println("template created from datasource -" + dataSource.toString());
        return new JdbcTemplate(dataSource);
    }

////    @Bean
//////    @Primary
////    @ConfigurationProperties(prefix="h2.db")
////    DataSource geth2DatasourceBean() {
////    DataSource ds= DataSourceBuilder.create().build();
////        this.dataSource=ds;
////        System.out.println("data source used is -" + dataSource.toString());
////        return ds;
////    }
////    @Bean
////    @Primary
////    @ConfigurationProperties(prefix="derby.db")
////    DataSource getDerbyDatasourceBean() {
////        DataSource ds= DataSourceBuilder.create().build();
////        this.dataSource=ds;
////        System.out.println("data source used is -" + dataSource.toString());
////        return ds;
////    }

}
