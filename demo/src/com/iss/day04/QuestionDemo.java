package com.iss.day04;

public class QuestionDemo {
    public static void main(String[] args) {

        //单选样例
//        SimpleQuestion q1 = new SimpleQuestion(1,"哈尔滨那个省？",new String[]{//这里的传入的String[]类型不可以直接{“fdsfjal”}这种形式，要new一下
//                "A.北京，B.河北，C.黑龙江，D.吉林"},"C");
//        System.out.println(q1.id);
//        System.out.println(q1.text);
//        System.out.println(q1.answer);
//        q1.print();
//        System.out.println(q1.Check(new String[]{"D"}));


        //多选样例
        MutltipleQuestion q2 = new MutltipleQuestion(2,"一下哪一个是动物？",new String[]{
                "A.猫，","B.狗，","C.草，","D.树"},new String[]{"A","B"});
        System.out.println(q2.id);
        System.out.println(q2.text);
        for (int i = 0;i < q2.answers.length;i++){
            System.out.print(q2.answers[i]+" ");
        }
        System.out.println();
        q2.print();
        System.out.println();

        System.out.println(q2.Check(new String[]{"A","B","C"}));
    }
}
