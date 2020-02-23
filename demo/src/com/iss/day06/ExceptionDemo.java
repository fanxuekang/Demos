package com.iss.day06;

public class ExceptionDemo {

    public static void main(String[] args) throws Exception {
        UserManager mgr = new UserManager();
        User u = mgr.reg("1175856464@qq.com","123456");
        System.out.println("注册成功！");
        User u1 = mgr.login("1175856464@123.com","123456");
        System.out.println(u1.email);
    }
}
