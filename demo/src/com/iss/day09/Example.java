package com.iss.day09;

import java.util.HashMap;
import java.util.Map;

/**
 * 区分get（）与containsKey（）
 * 首先创建一个有HashMap类实现的Map集合，并以此先Map集合中添加一个值对象null与“马先生”的映射关系
 * 然后分别通过这两个方法指定这两个键值对，最后执行一个不存在的键对象
 */
public class Example {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1001,null);
        map.put(1002,"马先生");
        System.out.println(map.get(1001));
        System.out.println(map.get(1002));
        System.out.println(map.get(1003));
        System.out.println(map.containsKey(1001));
        System.out.println(map.containsKey(1002));
        System.out.println(map.containsKey(1003));


    }


}
