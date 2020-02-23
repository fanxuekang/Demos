package com.iss.day05;

public class Demo03 {

    //String 的简单应用
    public static void main(String[] args) {
        String email = "1175856464@qq.com";
        //1.indexOf()
        int i = email.indexOf("@");
        System.out.println(i);

        //2.subString()
        String name = email.substring(0,i);
        System.out.println(name);

        //3.toUpperCase()
        String upper = email.toUpperCase();
        System.out.println(upper);

        // 4.charAt()
        System.out.println(email.charAt(3));

        //5.trim()
        String email1 = "    q w e r     r   ";
        System.out.println(email1.trim());

        //6. lastIndexOf()
        System.out.println(email.lastIndexOf("com"));

        //......

    }
}
