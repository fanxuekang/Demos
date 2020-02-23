package com.iss.day03;

import java.util.Random;

public class HomeWork_Finger {
    int  scissors;
    int stone;
    int cloth;
    public HomeWork_Finger(){
        this.scissors =1;
        this.stone = 2;
        this.cloth = 3;
    }
    public int selectFinger(){
        Random rand = new Random();
        return rand.nextInt(3) + 1;
    }
}
