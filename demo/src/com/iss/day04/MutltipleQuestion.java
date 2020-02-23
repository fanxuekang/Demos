package com.iss.day04;

import java.util.Arrays;

public class MutltipleQuestion extends Question {
    String[] answers ;
    public MutltipleQuestion(int id,String text,String[] options,String[] answers){
        this.id = id;
        this.text = text;
        this.options = options;
        this.answers = answers;
    }

    public boolean Check(String[] ans){
        return Arrays.equals(ans,answers);//一条完成，不用谢下面的
//        if(ans == null || ans.length == 1 || ans.length != answers.length){
//            return false;
//        }else{
//            boolean isRight = true;
//            for (int i = 0;i < ans.length;i++){
//                if(!ans[i].equals(answers[i])){
//                    isRight = false;
//                    break;
//                }
//            }
//            return isRight;
//        }
    }
}
