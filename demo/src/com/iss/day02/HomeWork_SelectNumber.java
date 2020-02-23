package com.iss.day02;

public class HomeWork_SelectNumber {
    public static void main(String[] args) {
        for (int i = 100;i <= 300;i++){
            int b = i / 100;
            int g = i % 10;
            if((b + g) % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
