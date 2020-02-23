package com.iss.day02;

import java.util.Scanner;

public class HomeWork_GetSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if(month >= 2 && month < 5){
            System.out.println("春季");
        }else if(month >= 5 && month < 9){
            System.out.println("夏季");
        }else if(month >= 9 && month < 11){
            System.out.println("秋季");
        }else if(month < 1 || month >12){
            System.out.println("请输入正确的月份");
        }else {
            System.out.println("冬季");
        }
    }
}
