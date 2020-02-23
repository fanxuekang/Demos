package com.iss.day07;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

import java.util.Scanner;

public class HomeWork_FiveIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ints = scanner.next().split(" ");
        try{
            for(int i = 0;i < 5;i++){
                int u = Integer.parseInt(ints[i]);
            }
        }catch (NumberFormatException e){
            System.out.println("请输入整数");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("请输入5个数");
        }



    }

}
