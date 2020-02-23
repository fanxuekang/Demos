package com.iss.day09;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap users = new HashMap();
        users.put("Tom",new User("Tom","123",12));
        users.put("Jerry",new User("Jerry","123",21));
        users.put("Ann",new User("Ann","123",11));
        users.put("Ann",new User("Ann","123",22));

        //登录查找
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("用户名：");
            String name = sc.nextLine();
            System.out.println("密码：");
            String pwd = sc.nextLine();
            if(!users.containsKey(name)){
                System.out.println("没有注册！");
                continue;
            }
            User user = (User)users.get(name);
            if(user.pwd.equals(pwd)){
                System.out.println("欢迎"+user.name+","+user.age);
                break;
            }
        }


    }
}

class User{
    String name;
    String pwd;
    int age;

    @Override
    public String toString() {
        return "名字："+name+" 年龄"+age;
    }

    public User(){}
    public User(String name, String pwd, int age) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }
}
