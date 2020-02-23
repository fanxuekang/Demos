package com.iss.day04;

public class HomeWork_ScoreStudent {
    String sName;
    HomeWork_Score[] scores;
    public HomeWork_ScoreStudent(){}
    public HomeWork_ScoreStudent(String sName,HomeWork_Score[] scores){
        this.sName = sName;
        this.scores = scores;
    }
    public void print(){
        System.out.println("姓名："+this.sName);
        for(int i = 0;i < 3;i++){
            System.out.println("\t科目编号："+scores[i].cId+"\t科目成绩："+scores[i].score);
        }
    }
}
