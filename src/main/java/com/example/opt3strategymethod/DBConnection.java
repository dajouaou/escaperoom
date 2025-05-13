package com.example.opt3strategymethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
        public static Connection getConnection() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/scrum_escape";
            String username = "root";
            String password = "1234";

            return DriverManager.getConnection(url, username, password);
        }

        // code voor data opslaan in de database
    }


