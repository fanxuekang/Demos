package com.iss.day2_13;

import java.sql.*;

public class LoginDemo {


    public static boolean login(int id ,String password){
        boolean flag=false;
        //1.创建连接
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1111");
            //2.创建执行器
            Statement stmt =  conn.createStatement();
            //3.执行SQL语句，返回结果集
//            ResultSet rs = stmt.executeQuery("select name from users where id = "+id+" and password = "+password);
            ResultSet rs = stmt.executeQuery("select name from users where id = 1 and password = '1234'");
            if(rs.next()){
                flag = true;
                System.out.println("结果集中的数据有：");
                System.out.println(rs.getString("name"));
            }
            //4.关闭连接
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;
    }



    public static void main(String[] args) {
        boolean flag = login(1,"1234");
        System.out.println(flag?"登录成功":"登录失败");
    }

}
