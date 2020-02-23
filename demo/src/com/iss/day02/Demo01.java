package com.iss.day02;

public class Demo01 {
    public static void main(String[] args) {
        //赋值运算
        int i = 10;
        int result = 10/5;
        //算术运算
        System.out.println(10/3);
        System.out.println(10%3);
        System.out.println(3.5/2);
        System.out.println(3.5%2);
        //关系运算符
        System.out.println('中' == 20013);
        //逻辑运算符
        System.out.println(!true);
        System.out.println(true ^ true);
        System.out.println(true != true );

        //位运算
        int a = 5 % -4;
        int b = 3 | 6 ;
        int c = 10 ^ 3;
        int d = ~(-4);

        //移位运算
        int a1 = -2 << 3;
        System.out.println(a1);
        /**
         * 00000000 00000000 00000000 00000010  ----2
         * 10000000 00000000 00000000 00000010  -2 首位变1表示负，其余不变
         * 11111111 11111111 11111111 11111110  移位运算要先取补码，首位不变，其余取反，末尾加1.
         * <-------------3位
         *11111 11111111 11111111 11111110000  -2的补码移完了，要再取补码回来。
         *10000 00000000 00000000 00000010000   -2移完了  值为-16
         */
        int b1 = 15 >> 2;
        /**
         * 00000000 00000000 00000000 00001111   15原码（正数的补码等于原码）  然后右移2位
         * 0000000000 00000000 00000000 000011
         */
        System.out.println(b1);

        int c1 = -5 >>> 1;
        /**
         * 00000000 00000000 00000000 00000101 5原码
         * 10000000 00000000 00000000 00000101  -5原码
         * 11111111 11111111 11111111 11111011   -5补码
         * 011111111 11111111 11111111 1111101    -5移完，现在是正的，所以在取补和原来一样。
         *
         */
        System.out.println(c1);

        //对象运算符
         System.out.println(" **************对象运算符***************");
        java.util.Date date = new java.util.Date();
        System.out.println(date instanceof java.util.Date);
        System.out.println(date instanceof java.sql.Date);


        System.out.println("************自增**************");
        /**
         * 自增：
         *      先++：先自加，在赋值
         *      后++：先赋值，后自加
         */
        int m = 1;
        m = m++;//

        System.out.println(m);

        System.out.println("************自增**************");
        /**
         * 三目运算
         *      表达式？值1：值2
         */
        int n = 10;
        System.out.println(n>5?"条件成立":"条件不成立");


        System.out.println(8>>>2);
        /**
         * 00000000 00000000 00000000 00001000    8
         * 00000000 00000000 00000000 00001000      8的补码
         * 0000000000 00000000 00000000 000010      补码移位
         * 0000000000 00000000 00000000 000010      原码  值为2
         */

    }





}


