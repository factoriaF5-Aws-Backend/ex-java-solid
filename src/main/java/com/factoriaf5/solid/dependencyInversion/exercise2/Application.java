package com.factoriaf5.solid.dependencyInversion.exercise2;

public class Application {
    private MySQLDatabase database;

    public Application() {
        this.database = new MySQLDatabase();
    }

    public void start() {
        database.connect();
    }

    //The Application class depends directly on MySQLDatabase, making it hard to switch to another database.
}
