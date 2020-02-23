package com.iss.day02;

import java.util.Arrays;

public class Demo06 {
    /**
     * 统计一个字符在字符串中出现的所有位置
     */
    public static int[] countAll(String str,char ch){
        int[] ary = {};
        for(int i = 0;i <= str.length()-1;i++){
            char c = str.charAt(i);
            if(c == ch){
                ary = Arrays.copyOf(ary,ary.length+1);//为了让数组长度扩充
                ary[ary.length-1] = i;
            }
        }
        return ary;
    }
    public static void main(String[] args) {
        String str = "统计一个字符在字符串中出现的所有位置";
        int[] ary = countAll(str,'字');
        System.out.println(Arrays.toString(ary));
    }

}
