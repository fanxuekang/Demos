package com.iss.day2_14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 给予查询实现分页
 * rownum关键字时实现Oracle数据库分页操作的
 */
public class PageDemo {
    public static void getPage(int pageSize,int page){
        int begin = (page-1)*pageSize +1;
        int end = begin + pageSize -1;
        String sql ="select id from (select id,rownum rn from emp ) where rn between ? and ?";
        Connection conn = ConnectionUtils.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,begin);
            stmt.setInt(2,end);
            rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("id"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionUtils.close(rs);
            ConnectionUtils.close(stmt);
            ConnectionUtils.close(conn);
        }

    }

    public static void main(String[] args) {
        getPage(5,3);
    }
}
