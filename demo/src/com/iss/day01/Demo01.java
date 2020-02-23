package com.iss.day01;


/**
 * 1.数据类型演示
 * 2.变量：
 *      1）声明
 *      2）赋值
 *      3)不能重命名
 *      4)作用域
 */
public class Demo01 {
    public static void main(String[] args){
        //变量：数据类型 变量名；
        byte b;
        b=1;
        byte b1 = 10;
        {
            System.out.println(b1);
            byte b2 = 100;
        }
//        System.out.println(b2);
//        byte b3=-129;
        byte b3 = -128;
        short s = 1;
        int i = 10;
        long l = 1000000L;//long型的变量长度超限之后最后加上L/l就可以不报错。
//   因为右边不论写成什么形式，都是int形，这是一个表达式，所以以后不论long的等号后面是不是超限，都最好加上L/l。


        float f = 3.14f;//同理，右边默认是double类型，但左边是float型，所以正确应该是在右边3.14后main加上F/f
        double d = 3.14d;//最好加上D/d

        char c = 20013;
        char c1 = 'a';
        char c2 = '2';
        char c3 = '%';
        char c4 = '中';
        System.out.println(c);
        System.out.println(c4);

        boolean boo = true;
        boolean boo1 = false;


        s = b3;
//        b3 = s;小类型转换成大类型，隐式转换，报错，可以使用b3=(byte)s;先强制转换成byte
        byte b4;
        b4=(byte)200;
        System.out.println(b4);

    }
}
