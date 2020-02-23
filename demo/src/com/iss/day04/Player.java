package com.iss.day04;

import java.util.Arrays;

public class Player {
    private String name ;
    private int id;
    private Card[] cards ={} ;


    public Player(){};
    public Player(int id,String name){
        setName(name);
        setId(id);
    }

    @Override
    public String toString() {
        return id+" "+name+Arrays.toString(cards);
    }

    public void add(Card card){
        cards = Arrays.copyOf(cards,cards.length+1);
        this.cards[this.cards.length-1] = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
}
