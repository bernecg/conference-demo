package com.bernardcg.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url(System.getenv("DB_URL"));
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");
        if (!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)) {
            builder.username(username);
            builder.password(password);
        }
        System.out.println("My custom datasource bean has been initialized and set...");
        return builder.build();
    }
}
