package com.iss.day06;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    //创建一个Users对象，存储User对象的集合
    private static Map<String,User> users = new HashMap<String,User>();
    int id = 1;
    public User reg(String email,String pwd) throws UserExistsException{
        if(users.containsKey(email)){
            throw new UserExistsException("该用户名已经被注册"+email);
        }
        User newUser = new User(id++,email,pwd);
        users.put(email,newUser);//将新用户存储到users集合中，
        return newUser;
    }

    //登录
public User login(String email,String pwd) throws Exception{
        if(!users.containsKey(email)){
            throw new EmailPwsException("无此用户！");
        }
        User u = users.get(email);
        if(!u.pwd.equals(pwd)){
            throw new EmailPwsException("密码不对!");
        }
        return u;
    }
}


//定义异常类
class UserException extends Exception{
    public UserException(String message){
        super(message);
    }
}

class EmailPwsException extends Exception{
    public EmailPwsException(String message){
        super(message);
    }
}