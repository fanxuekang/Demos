package com.iss.day07;

public class IntegerDemo {
    public static void main(String[] args) {
        String[] str = {"12","3","345","34"};
        int sum = 0;
        for(int i = 0;i < str.length;i++){
            int myInt = Integer.parseInt(str[i]);
            sum += myInt;
        }
        System.out.println(sum);

        String s = Integer.toString(123);
        String s1 = Integer.toBinaryString(123);//二进制
        String s2 = Integer.toHexString(123);
        String s3 = Integer.toOctalString(123);
        System.out.println(s+"\n"+s1+"\n"+s2+"\n"+s3);

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        int sizeInt = Integer.SIZE;
        System.out.println(maxInt);
        System.out.println(minInt);
        System.out.println(sizeInt);
    }
}
