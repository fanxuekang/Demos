package com.iss.day06;

public class Demo02 {

    public static void main(String[] args) {
        System.out.println(testStringBuffer(20000));
        System.out.println(testString(20000));
    }

    //测试StringBuilder的性能

    public static long testStringBuffer(int n){
        long start = System.currentTimeMillis();
        StringBuilder buf = new StringBuilder();
        for(int i = 0;i < n;i++){
            buf.append("c");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    //测试String的性能
    public static long testString(int n){
        long start = System.currentTimeMillis();
        String s = "";
        for(int i =0;i < n;i++){
            s += "c";
//            s  = new StringBuilder(s).append().toString();  上面的一行相当于这一行

        }
        long end = System.currentTimeMillis();
        return end - start;
    }


}
