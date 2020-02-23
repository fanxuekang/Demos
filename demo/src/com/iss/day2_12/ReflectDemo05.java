package com.iss.day2_12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * 访问某个对象的方法，
 * getMethod()可以调用任意对象的任意方法，
 *      调用无参方法，        Object methodObj = getMethod(obj, "add", new Class[]{}, new Object[]{});
 *
 */
public class ReflectDemo05 {
    public static void main(String[] args) {
        Object obj = create("com.iss.day2_12.Aoo");
        Object methodObj = getMethod(obj, "add", new Class[]{int.class, int.class}, new Object[]{1, 2});
        System.out.println(methodObj);
    }


    //1。创建类对象实例
    public static Object create(String classname) {
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
    public static Object getValue(Object obj, String fieldName) {
        //1.反射类型
        Class c = obj.getClass();
        //2.反射出类属性
        try {
            Field f = c.getDeclaredField(fieldName);
            //3.在obj对象上获取field属性值
            f.set(obj, 20);//设置属性值为20
            Object value = f.get(obj);
            return value;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException("未获取到");
        }

    }

    //3.访问对象的方法
    public static Object getMethod(Object obj, String method, Class[] paramterType, Object[] params) {
        //1.反射类型
        Class c = obj.getClass();
        //2.反射出类方法：

        try {
            Method m = c.getDeclaredMethod(method, paramterType);
            //3.在obj对象上调用方法，传递参数params
            Object value = m.invoke(obj, params);
            return value;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("没有获取方法");
        }

    }


}


class Aoo {
    int i = 10;

    public int add(int a, int b) {
        return a + b + i;
    }
}
