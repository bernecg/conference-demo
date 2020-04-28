package com.bernardcg.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
//    @Bean
//    public DataSource dataSource() throws URISyntaxException {
//        String dbUrl = System.getenv("JDBC_DATABASE_URL");
//        String username = System.getenv("JDBC_DATABASE_USERNAME");
//        String password = System.getenv("JDBC_DATABASE_PASSWORD");
//
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url(dbUrl);
//        builder.username(username);
//        builder.password(password);
//
//        return builder.build();
//    }
}
