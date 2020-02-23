package com.iss.day2_12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 通过反射访问对象的属性：
 *  1）field.get(obj)可以获取对象的属性值
 *  2）field.set(Object obj，Object value)；可以设置对象的属性值
 */
public class ReflectDemo04 {

    public static void main(String[] args) {
        Object obj = create("com.iss.day2_12.Moo");
        System.out.println(getValue(obj,"i"));
    }

    //1。创建类对象实例
    public static Object create(String classname){
        /*
        1.类加载
        1.1查找类根据classpath
        1.2加载到内存中
         */
        try {
            Class c = Class.forName(classname);
            //2.创建类实例
            Object obj = c.newInstance();
//            Object obj = new Object(); 与上面同作用,但是上面是与Class.forName(className)配套的。
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("未成功");
        }

    }

    //2.访问对象的属性
    public static Object getValue(Object obj,String fieldName){
        //1.反射类型
        Class c = obj.getClass();
        //2.反射出类属性
        try {
            Field f = c.getDeclaredField(fieldName);
            //3.在obj对象上获取field属性值
            f.set(obj,20);//设置属性值为20
            Object value = f.get(obj);
            return value;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException("未获取到");
        }

    }
    public static void reflect(Object obj){
        //1.getClass()
        Class c = obj.getClass();
        System.out.println("类的名字"+c.getName());
        //2.获取声明所有的属性，
        Field[] fields = c.getDeclaredFields();
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

class Moo{
    int i =10;
    public int add(int a,int b){
        return a+b+i;
    }
}

