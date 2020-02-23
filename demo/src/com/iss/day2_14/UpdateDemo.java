package com.iss.day2_14;

import java.sql.*;

/**
 * 修改和删除
 */
public class UpdateDemo {
    public static boolean updateEmp(int id,int age)   {
        String sql= "update emp set age = ? where id = ?";
        boolean flag = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1111");
             stmt = conn.prepareStatement(sql);
            stmt.setInt(1,age);
            stmt.setInt(2,id);
            int i = stmt.executeUpdate();
            if(i == 1){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

        return flag;
    }


    public static boolean deleteEmp(int id) {
        String sql = "delete from emp  where id = ?";
        boolean flag = false;
        Connection conn = null;
        PreparedStatement stmt =null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1111");
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,id);
            int i = stmt.executeUpdate();
            System.out.println(i);
            if(i ==1){
                flag = true;
            }
            System.out.println(flag);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;

    }

    public static void main(String[] args) {
        boolean flag = deleteEmp(5);
        System.out.println(flag?"删除成功":"删除失败");
        flag = updateEmp(6,66);
        System.out.println(flag?"更新成功":"更新失败");
    }

}
