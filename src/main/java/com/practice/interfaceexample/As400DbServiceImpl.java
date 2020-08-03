package com.practice.interfaceexample;

public class As400DbServiceImpl implements DatabaseService {
    @Override
    public String type() {
        return "as400DB";
    }

    @Override
    public boolean connectDB() {

        System.out.println("connection successful " );

        return true;
    }
}
