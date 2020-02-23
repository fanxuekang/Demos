package com.iss.day04;

import java.util.Scanner;

public class HomeWork_ScoreManagerment {//生成成绩单
    public static void main(String[] args) {
        HomeWork_ScorePaper paper = new HomeWork_ScorePaper();
        paper.main(new String[]{});
        paper.print();// 2)问

        paper.printEachClassScoreCount();//显示N个学生每门课总分，
        paper.printEachStudentScoreCount();//显示每个学生成绩总分
    }
}
