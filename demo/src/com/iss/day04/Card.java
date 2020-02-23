package com.iss.day04;

public class Card {
    private int suit;//实例变量 花色
    private int rank;//实例变量 点数
    public final static int HEART = 0;//静态属性
    public final static int SPADE = 1;
    public final static int DIMAOND = 2;
    public final static int CLUB = 3;

    public final static int JOKER = 4;

    public final static int THREE = 0;
    public final static int FOUR = 1;
    public final static int FIVE = 2;
    public final static int SIX = 3;
    public final static int SEVEN = 4;
    public final static int EIGHT = 5;
    public final static int NINE = 6;
    public final static int TEN = 7;
    public final static int JACK = 8;
    public final static int QUEEN = 9;
    public final static int KING = 10;
    public final static int ACE = 11;
    public final static int DECUCE = 12;
    public final static int BLACK = 13;
    public final static int COLOR = 14;

    public Card(){}
    public Card(int suit,int rank){
        setSuit(suit);
        setRank(rank);
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        if(suit < HEART || suit > JOKER){
            throw new RuntimeException("超出范围了！");
        }
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if(rank < THREE || rank > COLOR){
            throw new RuntimeException("超出花色范围了！");
        }
        this.rank = rank;
    }

    private final static String[] SUIT_NAMES = {"红桃","黑桃","方片","梅花",""};
    private  final static String[] RANK_NAMES = {"3","4","5","6","7","8","9","10","J","Q","K","A","2","小王","大王"};

    @Override
    public String toString() {
        return SUIT_NAMES[suit]+RANK_NAMES[rank];
    }
}
