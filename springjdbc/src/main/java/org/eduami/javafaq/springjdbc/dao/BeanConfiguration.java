package org.eduami.javafaq.springjdbc.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;


@Configuration
public class BeanConfiguration {

    @Bean
    public CarDao vehicleDao() {
        return new JdbcCarDao(dataSource());
    }

    @Bean
    public DataSource dataSource() {
    	SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost/demo");
        dataSource.setUsername("root");
        dataSource.setPassword("Test@123");
        return dataSource;

    }
}
