package com.iss.day02;

public class Demo02 {
    /**
     * 用if....else判断英语成绩得80分处于什么阶段，条件为：成绩大于90为优秀，
     * 75-90为优秀，60-75为及格，小于60为不及格
     */
    public static void main(String[] args) {
        int greed = 80;
        if(greed >= 90){
            System.out.println("优秀");
        }else if(greed >=75 && greed <90){
            System.out.println("良好");
        }else if(greed >=60 && greed < 75){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        String grade = Integer.toString(greed);//以下是错的
        switch (greed){
            case 0:if(greed >= 90){
                System.out.println("优秀");
            };break;
            case 1:if(greed >=75 && greed <90){
                System.out.println("良好");
            }break;
            case 3:if(greed >=60 && greed < 75){
                System.out.println("及格");
            };break;
            default:
                System.out.println("不及格");
        }
    }


}
