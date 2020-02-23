package com.iss.day2_13;

import java.sql.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class MyJDBCDemo {

    private static  String url;
    private static String dbUser;
    private static String dbPassword;

    public static void main(String[] args) {
        getParam("src/db_oracle.properties");
        getData();
    }

    //获取属性文件中的参数值
    //先读取filename指定的文件并解析，取出键值对中的数据。传递给成员变量
    public static void getParam(String fileName) {
        Properties props = new Properties();
        File file = new File(fileName);
        try {
            FileInputStream fis = new FileInputStream(file);
            //加载输入流的指定文件
            props.load(fis);
            //获取文件中key对应的value值，并赋值给全局变量
            url = props.getProperty("url");
            dbUser = props.getProperty("dbUser");
            dbPassword = props.getProperty("dbPassword");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 连接数据库获取数据，并打印在控制台上
     */

    public static void getData(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        //sql语句实现查询，
        String sql = "select * from emp";

        try {
            //创建连接
            conn = DriverManager.getConnection(url,dbUser,dbPassword);
            //创建执行器
            stmt = conn.createStatement();
            //循环打印结果集中的数据到控制台
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(id+","+name+","+age);
            }

            //关闭连接
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
