package com.iss.day04;


/**
 * 单选题子类
 */
public class SimpleQuestion extends Question {
    String answer ;//单选答案
    public SimpleQuestion(int id,String text,String[] options,String answer){
        this.id = id;
        this.text = text;
        this.options = options;
        this.answer = answer;
    }

    //更新父类中的Check方法
    public boolean Check(String[] answers){
        if(answers == null || answers.length != 1){
            return false;
        }else{
            return this.answer.equals(answers[0]);
        }
    }
}
