package com.iss.day06;

public class Demo01 {
    public static void main(String[] args) {
        StringBuilder buf = new StringBuilder();
        buf.append("马老师").append("喜欢").append("打游戏").append("特别是").append("王者荣耀")
                .insert(0,"数学").delete(5,7).append("。");//java中范围左闭右开
        System.out.println(buf);

        //将StringBuilder转化为String
        String str = buf.toString();
        System.out.println(str);




        //将String类型构造为StringBuilder
        StringBuilder s = new StringBuilder("123");

        String s1= "123";
        String s2 = "456";
        String s3 = s1 + s2;
        s2 = s3;
        System.out.println(s2);

    }
}
