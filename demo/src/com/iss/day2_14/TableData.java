package com.iss.day2_14;

import java.sql.*;

public class TableData {
    public static void getData(String tableName){
        String sql = "select * from "+tableName;
        Connection conn = ConnectionUtils.getConnection();
        Statement stmt = null;
        ResultSet rs = null;


        try {
            //数据库中的元数据
            DatabaseMetaData dbm = conn.getMetaData();

            //数据库名
            System.out.println(dbm.getDatabaseProductName());

            //数据库版本号
            System.out.println(dbm.getDatabaseMajorVersion());

            //数据库rul
            System.out.println(dbm.getURL());

            //用户名
            System.out.println(dbm.getUserName());

            //结果集数据
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            //获取结果集中的元数据
            ResultSetMetaData rsmd = rs.getMetaData();

            //获取列数
            int col = rsmd.getColumnCount();

            //获取字段名
            for(int i = 1;i<=col;i++){
                System.out.println(rsmd.getColumnName(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            ConnectionUtils.close(rs);
            ConnectionUtils.close(stmt);
            ConnectionUtils.close(conn);
        }

    }

    public static void main(String[] args) {
        getData("emp");
    }
}
