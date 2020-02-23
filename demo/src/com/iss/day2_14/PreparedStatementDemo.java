package com.iss.day2_14;

/**
 * 使用preparedStatement实现插入
 */

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {
public static boolean addEmp(int id,String eName,int eAge){
    boolean flag = false;
    Connection conn = null;
    PreparedStatement stmt = null;
    String sql = "insert into emp(id,name,age) values(?,?,?)";//问号表示占位符，先把这个位置站下来，以后输入的内容再说。
    try {//这一段注意与statement区分
        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1111");

        stmt = conn.prepareStatement(sql);
        //给占位符赋值
        stmt.setInt(1,id);
        stmt.setString(2,eName);
        stmt.setInt(3,eAge);
        //执行
        int i = stmt.executeUpdate();
        if(i == 1){
            flag = true;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }finally{
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    return flag;
}

    public static void main(String[] args) {
        boolean flag = addEmp(1,"liuliu",31);
        System.out.println(flag?"插入成功":"插入失败");
    }

}
