package com.iss.day09;

import com.iss.day08.Demo.Node;
import com.iss.day08.Demo.Worm;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class WormPane {
    private Worm worm;
private int rows = 10;
private int cols = 20;
//食物
    private Set<Node> foods = new HashSet<Node>();
    public WormPane(){
        worm = new Worm();//蛇

    }

    public void print(){
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
                if(i==0 || i==rows-1){
                    System.out.print("-");
                } else if (j == 0 || j == cols - 1) {
                    System.out.print("|");
                }else if(worm.contains(i,j)){
                    System.out.print("@");
                }else if(foods.contains(new Node(i,j))){
                    System.out.println("@");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();//换行
        }
    }

    public void initFoods(int n){
        Random r = new Random();
        while (true){
            int i = r.nextInt(rows-2)+1;
            int j = r.nextInt(cols-2)+1;
            if(worm.contains(i,j)){
                continue;
            }
            Node  food = new Node(i,j);
            if(foods.contains(food)){
                continue;
            }
            foods.add(food);
            if(foods.size() == n){
                break;
            }
        }
    }

    public Worm getWorm() {
        return worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }
}