package ru.bryanin.dev.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {
    private static final String URL_KEY = "db.url";
    private static final String USERNAME_KEY = "db.username";
    private static final String PASSWORD_KEY = "db.password";

    private ConnectionManager() {
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(PropertiesUtil.getKey(URL_KEY), PropertiesUtil.getKey(USERNAME_KEY), PropertiesUtil.getKey(PASSWORD_KEY));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
