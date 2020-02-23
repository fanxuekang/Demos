package com.iss.day2_14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ConnectionUtils {

    private static String url;
    private static String dbUser;
    private static String dbPassword;

    public static void getParam(String fileName) {
        Properties props = new Properties();
        File file = new File(fileName);
        try {
            FileInputStream fis = new FileInputStream(file);
            props.load(fis);
            url = props.getProperty("url");
            dbUser = props.getProperty("dbUser");
            dbPassword = props.getProperty("dbPassword");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        getParam("src/db_oracle.properties");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, dbUser, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //关闭资源方法
    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Statement conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(PreparedStatement conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
