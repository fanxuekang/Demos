package com.iss.day02;

import java.util.Arrays;

public class Demo09 {
    /**
     * 冒泡排序，比较相邻的元素，将小的放前面
     * i 代表比较次数，j代表比较位置
     * I的范围是0。。。length-1
     * j的取值范围0.。。。ary.length-i-1
     */

//    public static int[] bubbleSort(int[] ary){
//        for(int i = 0;i < ary.length-1;i++){
//            for(int j = 0;j < ary.length-i-1;j++){
//                if(ary[j] > ary[j+1]){
//                    int temp = ary[j];
//                    ary[j] = ary[j+1];
//                    ary[j+1] = temp;
//                }
//            }
//        }
//        return ary;
//    }
//    public static void main(String[] args) {
//        int[] ary = {13,3,2,53,67,32};
//        ary = bubbleSort(ary);
//        System.out.println(Arrays.toString(ary));
//
//    }
    public static int[]  bublluSort(int[] ary){
        for(int i = 0;i < ary.length;i++){
            for(int j = 0;j < ary.length-i-1;j++){
                if(ary[j] > ary[j+1]){
                    int temp = ary[j+1];
                    ary[j+1] = ary[j];
                    ary[j] = temp;
                }
            }
        }
        return ary;
    }
    public static void main(String[] args) {
        int[] ary = {1,5,3,2,4};
        ary = bublluSort(ary);
        System.out.println(Arrays.toString(ary));

    }
}
