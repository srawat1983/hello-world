package com.practice;

import com.practice.h2jdbc.example.H2JdbcExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class App implements CommandLineRunner {
    Logger LOG= LoggerFactory.getLogger(App.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    H2JdbcExample h2JdbcExample;
    public static void main(String [] args){
        SpringApplication.run(App.class);
    }


    @Override
    public void run(String... strings) throws Exception {
        h2JdbcExample.runH2Example();
        LOG.info("JDBC Datasource is -" + jdbcTemplate.getDataSource().toString());
        System.out.println("running update sql - update student set name = 'sandip' where passport_number = 'E1234567' " + jdbcTemplate.update("update student set name = 'sandip' where passport_number = 'E1234567' "));
    }
}
