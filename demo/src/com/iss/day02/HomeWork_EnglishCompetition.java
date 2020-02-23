package com.iss.day02;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_EnglishCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allGrade = scanner.nextLine();
        String[] grades = allGrade.split("\\s+");
        try {
            double[] douGrade = new double[grades.length];
            for(int i = 0;i < grades.length;i++){
                douGrade[i]=Double.parseDouble(grades[i]);
            }
            Arrays.sort(douGrade);
            double sum = 0.00;
            for(int i = 1;i < douGrade.length-1;i++){
                sum += douGrade[i];
            }
            System.out.println(sum/(douGrade.length-2));
        }catch (NumberFormatException e){
            System.out.println("输入的成绩格式不正确！");
        }

    }
}
