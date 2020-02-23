package com.iss.day2_14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

/**
 * 批处理操作
 */
public class BatchDemo {
    public static void main(String[] args) {
        String s1 = "abc" + "def";
        String s2 = new String(s1);
        if(s1 == s2){
            System.out.println("1");
        }if(s1.equals(s2)){
            System.out.println("2");
        }
    }
    public static void batchDemo(){
        String sql = "insert into emp(id) values(?)";
        Connection conn = ConnectionUtils.getConnection();
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            stmt = conn.prepareStatement(sql);
            for(int i = 0;i<10;i++){
                stmt.setInt(1,i);
                //把sql语句加入到批处理中
                stmt.addBatch();
                if(i %5 ==0){
                    stmt.executeBatch();
                    stmt.clearBatch();
                }
            }

            //执行最后一条sql语句
            stmt.executeBatch();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            ConnectionUtils.close(conn);
            ConnectionUtils.close(stmt);

        }

    }
}
