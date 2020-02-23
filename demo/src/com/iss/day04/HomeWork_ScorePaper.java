package com.iss.day04;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_ScorePaper {//生成成绩单
    static  HomeWork_ScoreStudent[] paper = new HomeWork_ScoreStudent[]{};
    public static HomeWork_ScoreStudent[] main(String[] args) {
        System.out.println("请输入学生的个数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0;i < n;i++){
            paper = Arrays.copyOf(paper,paper.length+1);
            System.out.println("请输入第"+(i+1)+"个学生的姓名：");
            String tempName = scanner.next();
            HomeWork_Score[] scores = new HomeWork_Score[3];
            for(int j = 0;j < 3;j++){
                System.out.println("请输入第"+(j+1)+"门科目的编号：");
                String tempCId = scanner.next();
                System.out.println("请输入第"+(j+1)+"门科目的成绩：");
                int tempCScore = scanner.nextInt();
                HomeWork_Score tempScore = new HomeWork_Score(tempCId,tempCScore);
                scores[j] = tempScore;
            }
            HomeWork_ScoreStudent scoreStudent = new HomeWork_ScoreStudent(tempName,scores);
            paper[i] = scoreStudent;
        }
        return paper;
    }
    public void print(){
        for (int i = 0;i < paper.length;i++){
            paper[i].print();
        }
    }

    public void printEachClassScoreCount(){
        System.out.println("每门课的成绩总分如下：");
        for(int i =0;i < 3;i++){
            int eachSum = 0;
            for(int j = 0;j < paper.length;j++){
                eachSum += paper[j].scores[i].score;
            }
            System.out.println("\t课程编号："+paper[0].scores[i].cId+"\t\t学生总分："+eachSum);
        }
    }

    public void printEachStudentScoreCount(){
        System.out.println("每个学生成绩总分信息如下：");
        for(int i = 0;i < paper.length;i++){
            int eachSum = 0;
            for(int j = 0;j < 3;j++){
                eachSum += paper[i].scores[j].score;
            }
            System.out.println("\t姓名："+paper[i].sName+"\t\t所有科目总分："+eachSum);
        }
    }



}
