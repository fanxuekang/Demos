package com.iss.day2_14;

import javax.imageio.stream.ImageInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
    public static void updateFinalGrade(String sid,double sfinalgrade){
        String sql="update score set s_finalgrade = "+sfinalgrade+" where s_id = '"+ sid+"'";
        Connection conn = ConnectionUtils.getConnection();
        Statement stmt = null;
        //将jdbc中的 自动提交关闭
        try {
            conn.setAutoCommit(false);
            stmt = conn.createStatement();
            int n = stmt.executeUpdate(sql);
            if(n==1){
                //手动提交
                conn.commit();

            }
            //修改为自动提交
            conn.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionUtils.close(conn);
            ConnectionUtils.close(stmt);
        }
    }

    public static void main(String[] args) {
        updateFinalGrade("1",90);
    }
}
