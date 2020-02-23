package com.iss.day04;

import java.util.Scanner;

public class HomeWork_Bank {
    double balance;
    public HomeWork_Bank(){}
    public HomeWork_Bank(double balance){
        this.balance = balance;
    }

    public void printBalance(){
        System.out.println("当前帐户余额为："+this.balance);
    }

    public void addBalance(double add){
        this.balance += add;
        System.out.print("存入成功！");
        printBalance();
    }

    public void getBalance(double get){
        this.balance -= get;
        System.out.print("取款成功！");
        printBalance();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HomeWork_Bank balance = new HomeWork_Bank(1000.0);
        balance.printBalance();
        System.out.print("请输入存款金额：");
        balance.addBalance(scanner.nextDouble());
        System.out.print("请输入取款金额：");
        balance.getBalance(scanner.nextDouble());

    }
}
