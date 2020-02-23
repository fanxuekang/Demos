package com.iss.day07;

import com.iss.day06.User;
import com.iss.day06.UserExistsException;
import com.iss.day06.UserManager;

import java.util.Scanner;

public class ExceptionDemo02 {   //老师做的
    public static void main(String[] args) {
        UserManager mrg = new UserManager();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("1: 注册    2：登录    ");
            String cmd = s.nextLine();
            if("1".equals(cmd)){    //一致的内容放在前面，用户输入的内容放在后面
                //注册用户
                System.out.println("email:");
                String email = s.nextLine();
                System.out.println("pwd");
                String pwd = s.nextLine();
                try{
                    User user = mrg.reg(email,pwd);
                    System.out.println("注册成功"+user);
                }catch (UserExistsException e){
                    e.printStackTrace();
                }
            }else if("2".equals(cmd)){
                System.out.println("email:");
                String email = s.nextLine();
                System.out.println("pwd");
                String pwd = s.nextLine();

                try{
                    User user1 = mrg.login(email,pwd);
                    System.out.println("登录成功"+user1);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }else{
                System.out.println("不识别！");
            }
        }
    }
}
