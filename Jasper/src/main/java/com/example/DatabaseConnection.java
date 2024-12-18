package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection connect() {
        try {
            String url = "jdbc:localhost:3024:~/peliculas";
            String user = "localhost";
            String password = "1234";
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
