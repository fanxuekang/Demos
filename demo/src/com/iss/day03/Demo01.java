package com.iss.day03;

public class Demo01 {
    public int add(int a, int b) {
        int ans = a + b;
        return ans;
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        int a = 1, b = 2;
        System.out.println("两数之和为："+demo01.add(a,b));
    }


}
