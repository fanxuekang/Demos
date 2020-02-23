package com.iss.day03;


/**
 * java 值传递的过程
 */
public class ParamDemo {
    public static void main(String[] args) {
        int a = 1;
        add(a);
        Koo koo = new Koo();
        add(koo);
        System.out.println(a+","+koo.a);

    }
    public static int add(int a){
        a++;
        return a;
    }
    public static int add(Koo koo){
        Koo k = koo;
        k.a++ ;
        return 3;
    }
}

class Koo{
    int a = 1;
}
