package com.practice.h2jdbc.example;

import org.springframework.beans.factory.annotation.Autowired;

public class H2JdbcExample {

    @Autowired
    H2JdbcService h2JdbcService;


    public void runH2Example() {
        h2JdbcService.getRowsAsString();
        h2JdbcService.fetchRowsAsMapList();
        h2JdbcService.fetchRowsAsPojo();

    }


}
