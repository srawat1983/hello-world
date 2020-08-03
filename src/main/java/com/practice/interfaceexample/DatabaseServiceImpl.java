package com.practice.interfaceexample;

public class DatabaseServiceImpl {

    DatabaseService databaseService;

    public DatabaseService database(){
        databaseService = new OracleDbServiceImpl();
        return databaseService;
    }



}
