package com.iss.day07;

import java.util.Scanner;

public class HomeWork_Sanjiao {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        sanjiao(a,b,c);
    }
public static void sanjiao(int a,int b,int c) throws Exception{
    if(!(a + b > c && a + c >b && b + c > a)){
        throw  new IllegalArgumentException(a+","+b+","+c+"不能构成三角形");
    }else {
        System.out.println(a+","+b+","+c+"可以构成三角形");
    }
}

}
class IllegalArgumentException extends Exception{
    public IllegalArgumentException(String massage){
        super(massage);
    }
}