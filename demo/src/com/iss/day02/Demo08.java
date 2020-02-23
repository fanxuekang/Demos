package com.iss.day02;

public class Demo08 {
    public static void main(String[] args) {
        for(int i = 2;i <= 10;i++){
            int k = 0;
            for(int j = 2;j <= i/2;j++){
                if(i % j == 0){
                    k = 1;
                }
            }
            if(k == 0){
                System.out.println(i);
            }
        }
    }
}