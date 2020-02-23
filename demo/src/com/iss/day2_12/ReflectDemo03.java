package com.iss.day2_12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 根据类名创建实例：
 *  1）Class.forName()静态方法，可以利用类名在classpath中查找对应的类，并加载到内存中，返回这个class
 *  2）Class.forName（）加载类的过程中采用了“懒惰方式”
 *      懒惰方式：检查发现，如果已经加载了就不在加载了，直接返回已经加载的类
 *  3）.newInstance()
 */
public class ReflectDemo03 {
    public static void main(String[] args) {
//执行create（）,执行他的条件是无参构造器
        Object obj = create("com.iss.day2_12.Koo");
        reflect(obj);
    }

    //根据类型创建对象实例
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
class Koo{
    int i =10;
    public int add(int a,int b){
        return a+b+i;
    }
}
