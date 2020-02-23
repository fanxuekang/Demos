package com.iss.day07;

import com.iss.day06.User;
import com.iss.day06.UserExistsException;
import com.iss.day06.UserManager;

import java.util.Scanner;

public class ExceptionDemo01 {
    public static void main(String[] args)  {
        UserManager mgr = new UserManager();
//        try{
//            User u = mgr.reg("Lili@qq.com","123456");
//            System.out.println("注册成功");
//        }catch(UserExistsException e){
//            e.printStackTrace();
//        }

        //循环注册用户信息

        Scanner scanner = new Scanner(System.in);//自己做的
        System.out.println("请选择：1.注册     2.登录  q:返回");
        String select = scanner.next();
        if(select.equals("1")){
        do{
            System.out.println("用户名：");
            String name = scanner.next();
            if(name.equals("q")){
                ExceptionDemo01 exceptionDemo01 = new ExceptionDemo01();
                exceptionDemo01.main(new String[]{});
            }else{
                System.out.println("密码：");
                String pwd = scanner.next();
                try{
                    mgr.reg(name,pwd);
                    System.out.println("注册成功！");
                }catch (UserExistsException e){
                    e.printStackTrace();
                }
            }
        }while (true);
        }else if(select.equals("2")){
            do{
                System.out.println("用户名：");
                String name = scanner.next();
                if(name.equals("q")){
                    ExceptionDemo01 exceptionDemo01 = new ExceptionDemo01();
                    exceptionDemo01.main(new String[]{});
                }else{
                    System.out.println("密码：");
                    String pwd = scanner.next();
                    try{
                        mgr.login(name,pwd);
                        System.out.println("登录成功！");
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }while (true);
        }

    }


}


