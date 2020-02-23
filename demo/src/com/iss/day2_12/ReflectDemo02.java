package com.iss.day2_12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectDemo02 {
    public static void main(String[] args) {
        reflect(new Foo());
    }

    public static void reflect(Object obj){
        //1.getClass()
        Class c = obj.getClass();
        System.out.println("类的名字"+c.getName());
        //2.获取声明所有的属性，
        Field[] fields = c.getFields();
        System.out.println("属性有：");
        for(Field f:fields){
            System.out.println(f.getType()+":"+f.getName());
        }
        //3.获取方法
        Method[] methods = c.getDeclaredMethods();
        System.out.println("方法有：");
        for(Method m : methods){
            System.out.println(m.getReturnType()+","+m.getName()+","+
                    Arrays.toString(m.getParameterTypes()));
        }

        //4.获取构造器
        Constructor[] constructors = c.getConstructors();
        System.out.println("构造器有：");
        for(Constructor con : constructors){
            System.out.println(con.getName()+","+Arrays.toString(con.getExceptionTypes()));
        }
    }

}

class Foo{
    int i = 5;
    public int add(int a,int b){
        return a+b;
    }
}
