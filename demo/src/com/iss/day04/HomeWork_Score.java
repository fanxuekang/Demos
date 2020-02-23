package com.iss.day04;

public class HomeWork_Score {
    String cId;
    int score;

    public HomeWork_Score(){}
    public HomeWork_Score(String cId,int score){
        setcId(cId);
        setScore(score);
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
