package com.practice.interfaceexample;

public class OracleDbServiceImpl implements DatabaseService {
    @Override
    public String type() {
        return "oracleDB";
    }

    @Override
    public boolean connectDB() {
        System.out.println("connection successful " );
        return true;
    }
}
