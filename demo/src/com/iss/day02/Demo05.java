package com.iss.day02;


import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        int[] src = {1,2,3,4};
        int[] dest = new int[4];
      //原数组名，原数组复制开始位置，目标数组，目标数组复制开始位置，复制长度
        System.arraycopy(src,0,dest,0,src.length);
        System.out.println(Arrays.toString(dest));
        int[] dest1 = Arrays.copyOf(src,src.length);
        System.out.println(Arrays.toString(dest1));
    }
}
