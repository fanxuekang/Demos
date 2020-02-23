package com.iss.day03;

import java.util.Scanner;

public class HomeWork_FingerGuessing {
    public static void main(String[] args) {
        HomeWork_Finger finger = new HomeWork_Finger();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的选择："+"\n"+"1:剪刀    2：石头    3：布");
        int input = scanner.nextInt();
        int machine = finger.selectFinger();
        switch (input){
            case 1:if(machine == 2){
                System.out.println("抱歉，您输了！");
            }else if (machine == 3){
                System.out.println("恭喜，您赢了！");
            }else{
                System.out.println("平局！");
            }break;
            case 2:if(machine == 3){
                System.out.println("抱歉，您输了！");
            }else if (machine == 1){
                System.out.println("恭喜，您赢了！");
            }else{
                System.out.println("平局！");
            }break;
            case 3:if(machine == 1){
                System.out.println("抱歉，您输了！");
            }else if (machine == 2){
                System.out.println("恭喜，您赢了！");
            }else{
                System.out.println("平局！");
            }break;
            default:
                System.out.println("请输入正确的选择！");
        }

    }

}
