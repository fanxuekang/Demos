package com.iss.day10;

import com.iss.day04.Card;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDemo {

    public static void main(String[] args) throws IOException {
        List<Card> cards = new ArrayList<Card>();
        for (int rank = Card.THREE; rank <= Card.DECUCE; rank++) {
            cards.add(new Card(Card.HEART, rank));
            cards.add(new Card(Card.SPADE, rank));
            cards.add(new Card(Card.DIMAOND, rank));
            cards.add(new Card(Card.CLUB, rank));
        }
        cards.add(new Card(Card.JOKER, Card.BLACK));
        cards.add(new Card(Card.JOKER, Card.COLOR));


        //洗排
        Collections.shuffle(cards);

        //将集合纸牌写入到文件中
        String file = "E:\\card.txt";
        //用文件流来打开文件
        FileOutputStream fos = new FileOutputStream(file);
        //放入缓冲流
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //加入过滤器流
        DataOutputStream out = new DataOutputStream(bos);
        //
        for (Card c : cards
        ) {
            out.writeInt(c.getSuit());
            out.writeInt(c.getRank());

        }
        out.close();
        System.out.println(cards);


        /**
         * 以上是写
         * 以下是读
         */


        //读取card.txt文件中的内容到集合中
        List<Card> str = new ArrayList<Card>();
        //通过文件流将文件打开
        FileInputStream fis = new FileInputStream(file);

        //放入缓冲
        BufferedInputStream bis = new BufferedInputStream(fis);

        //过滤
        DataInputStream in = new DataInputStream(bis);


        //存入数组
        try{
            while(true){
                int suit = in.readInt();
                int rank = in.readInt();
                str.add(new Card(suit,rank));
            }
        }catch (EOFException e){//出现这个异常表示文件已经读取完毕。
            System.out.println("文件已经读完");
        }

        System.out.println(str);
    }



}
