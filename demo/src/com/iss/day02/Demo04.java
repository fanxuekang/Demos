package com.iss.day02;

public class Demo04 {
    /**
     * while循环
     */
    public static void main(String[] args) {
        int i = 1;
        int account = 0;
        while(i <= 99){
            account = account + i;//account += i;
            i++;
        }
        System.out.println(account);

        /**
         * do ....while循环
         */
        int l = 1;
        int sum = 0;
        do {
            sum = sum + l;
            l++;
        }while (l<=99);
        System.out.println(sum);

        /**
         * for 循环
         */
        int sum1 = 0;
        for(int u = 1;u <= 99;u++){
            sum1 += u;
        }
        System.out.println(sum1);


        /**for each 循环
         *
         */
        int[] ary = {1,2,3,4};
        for (int s:ary//循环遍历数组中的值
             ) {
            System.out.println(s);
        }



    }

}
