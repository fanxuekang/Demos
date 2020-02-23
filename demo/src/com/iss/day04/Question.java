package com.iss.day04;

/**
 * 选择题父类，共通的内容在这里定义
 *
 */
public class Question {
    int id;//题号
    String text;//题干
    String[] options = {};//选项

    //打印题目的方法
    public  void print(){
        System.out.println(id+"."+text);
        for(int i = 0;i < options.length;i++){
            System.out.print("  "+options[i]);
        }
        System.out.println();
    }


    //检查答案方法
    public boolean Check(String[] answers){
        return false;
    }

}
