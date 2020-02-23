package com.iss.day02;

import java.util.Arrays;

public class Demo07 {

    public static int[]  numberStatstic(int num,int a,int b){
        int [] ary = {};
        for (int i = 1;i <= num;i++){
            if(i % 3 == 0 && i % 7 ==0){
                ary = Arrays.copyOf(ary,ary.length+1);
                ary[ary.length-1] = i;
            }
        }
        return ary;
    }
    public static void main(String[] args) {
        int[] ans = numberStatstic(100,3,7);
        System.out.println(Arrays.toString(ans));
    }
}
