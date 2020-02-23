package com.iss.day04;

import java.util.Scanner;

public class PaperDemo {
    public static void main(String[] args) {
        //构建一个试卷，是有两个题目的集合
        Question[] paper = new Question[2];

        //添加两道题
        //单选样例
        paper[0] = new SimpleQuestion(1,"哈尔滨那个省？",new String[]{//这里的传入的String[]类型不可以直接{“fdsfjal”}这种形式，要new一下
                "A.北京，B.河北，C.黑龙江，D.吉林"},"C");
        //多选样例
        paper[1] = new MutltipleQuestion(2,"一下哪一个是动物？",new String[]{
                "A.猫，","B.狗，","C.草，","D.树"},new String[]{"A","B"});

        Scanner scanner = new Scanner(System.in);
        //显示试题,接受答案
        for(int i = 0;i < paper.length;i++){
            Question q = paper[i];//定义试卷中的试题,父类变量可以接受子类对象
            q.print();
            System.out.println("请输入答案，多选答案以“,”分隔");
            String[] ans = scanner.nextLine().split(",");
            if(q.Check(ans))
                System.out.println("正确！");
            else
                System.out.println("错误!");
        }
    }
}
