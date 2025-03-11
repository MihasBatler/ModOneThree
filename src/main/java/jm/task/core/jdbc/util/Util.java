package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String url = "jdbc:mysql://localhost:3306/mihassbd";
    private static final String user = "root";
    private static final String password = "root19root";

    public static Connection connection = null;

    public static Connection getConnection() {

        try {
            connection = DriverManager.getConnection(url, user, password);
            // System.out.println("Подключение к базе данных успешно установлено!");

        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к базе данных:" + e);
            throw new RuntimeException(e);
        }
        return connection;
    } // реализуйте настройку соеденения с БД
}
