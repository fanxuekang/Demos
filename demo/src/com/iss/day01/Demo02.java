package com.iss.day01;

import java.util.Arrays;
import java.util.Scanner;

public class Demo02 {

    public static void main(String[] args){
        //声明数组
        int[] months;
        boolean[] members;
        String[] names;

        //创建数组
        int[] ary = new int[5];//动态定义
        System.out.println(ary);//输出物理地址
        System.out.println(Arrays.toString(ary));//正确输出数组内容
        System.out.println(ary[3]);
        int[] ary1 = {1,2,3,4};//静态定义
        System.out.println(ary1);
        System.out.println(Arrays.toString(ary1));
        System.out.println(ary1[3]);
        int[] ary2 = new int[]{1,2,3,4,5};//静态定义
        System.out.println(ary2);
        System.out.println(Arrays.toString(ary2));
        System.out.println(ary2[3]);
        System.out.println("_______________________________________");


        int[][] ar1 = new int[2][3];
        System.out.println("请输入年龄：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);
    }
}
