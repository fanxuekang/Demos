package com.iss.day2_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 新增数据到emp表中
 */
public class InsertDemo {

    public static boolean insertEmp(int id ,String empName,int empAge){
        boolean flag = false;
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                    "system","1111");
            stmt = conn.createStatement();
            String sql  = "insert into emp values("+id+",'"+empName+"',"+empAge+")";
            int n  = stmt.executeUpdate(sql);
            if(n == 1 ){
                flag = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }

        return flag;
}

    public static void main(String[] args) {
        boolean flag  = insertEmp(5,"Lili",24);
        System.out.println(flag?"插入成功":"插入失败");
    }

}
