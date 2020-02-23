package com.iss.day02;

import java.util.Scanner;

public class HomeWork_Diamond {
    public static void main(String[] args) {
        System.out.println("请输入奇数的菱形长轴长度：");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        if (l % 2 == 0) {
            System.out.println("数值不正确，请输入一个奇数");
            return;
        }
        for (int j = 0; j < (l / 2); j++) {
            for (int i = 0; i < (l / 2) - j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < j * 2 + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 0; j < l; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 1; j <= (l / 2); j++) {
            for (int i = 0; i < j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < l - 2 * j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
