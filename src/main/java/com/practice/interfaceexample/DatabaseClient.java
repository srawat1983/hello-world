package com.practice.interfaceexample;

public class DatabaseClient {
    DatabaseServiceImpl databaseService;



    public static void main(String[] args){

        DatabaseClient client = new DatabaseClient();
        client.databaseService = new DatabaseServiceImpl();

        System.out.println("database in use is -" + client.databaseService.database().type());
        client.databaseService.database().connectDB();


    }

}
