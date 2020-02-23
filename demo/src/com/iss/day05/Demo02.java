package com.iss.day05;

import java.util.Arrays;

/**
 * char类型与String类型
 */

public class Demo02 {
    public static void main(String[] args) {

        //char方式

        char[] c1 = {'中','北'};
        char[] c2 = {'天','软','产','业','园'};
        System.out.println(c2);
        char[] c3 = Arrays.copyOf(c1,c1.length+c2.length);
        System.arraycopy(c2,0,c3,c1.length,c2.length);
        System.out.println(c3);
        //String方式

        String s1 = "中北";
        String s2 = "天软产业园";
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}
