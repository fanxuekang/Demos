package com.iss.day03;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0;i < 20;i++){
            System.out.println(random.nextInt());
        }

    }
}
