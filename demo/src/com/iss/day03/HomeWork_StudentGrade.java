package com.iss.day03;

import java.util.Scanner;

public class HomeWork_StudentGrade {


    public static double gradeSum(HomeWork_Grade grade1,HomeWork_Grade grade2,HomeWork_Grade grade3,HomeWork_Grade grade4){
        return grade1.grade + grade2.grade + grade3.grade + grade4.grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("学生姓名：");
        String name = scanner.next();

        System.out.println("科目一编号：");
        String classNumber1 = scanner.next();
        System.out.println("科目一成绩");
        double grad1 = scanner.nextDouble();
        HomeWork_Grade grade1 = new HomeWork_Grade(classNumber1,grad1);
        System.out.println();

        System.out.println("科目二编号：");
        String classNumber2 = scanner.next();
        System.out.println("科目二成绩");
        double grad2 = scanner.nextDouble();
        HomeWork_Grade grade2 = new HomeWork_Grade(classNumber2,grad2);
        System.out.println();

        System.out.println("科目三编号：");
        String classNumber3 = scanner.next();
        System.out.println("科目三成绩");
        double grad3 = scanner.nextDouble();
        HomeWork_Grade grade3 = new HomeWork_Grade(classNumber3,grad3);
        System.out.println();

        System.out.println("科目四编号：");
        String classNumber4 = scanner.next();
        System.out.println("科目四成绩");
        double grad4 = scanner.nextDouble();
        HomeWork_Grade grade4 = new HomeWork_Grade(classNumber4,grad4);
        System.out.println();

        HomeWork_StudentGrade studentGrade = new HomeWork_StudentGrade();
        Double sum = studentGrade.gradeSum(grade1,grade2,grade3,grade4);
        System.out.println("该生四科总分为：" + sum + "该生平均分为："+ sum/4);
    }
}
