package com.pluralsight.conferencedemo.config;

// This class can be used to customize and create changes or configuration in our persistence tier.

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://localhost:5432/conference_app");
//        builder.username("postgres");
//        builder.password("password123");
//        System.out.println("Custom data source bean has been initialized and set");
//
//        return builder.build();
//    }

}

