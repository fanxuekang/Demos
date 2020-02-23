package com.iss.day08.Demo;

import java.util.Scanner;

public class WormDemo {

    public static void main(String[] args) {
        WormPane pane = new WormPane();
        Worm worm = pane.getWorm();
        pane.initFoods(10);
        Scanner sc = new Scanner(System.in);
        while(true){
            pane.print();
            System.out.println(worm);
            String dir = sc.nextLine();
            if(dir.equalsIgnoreCase("w")){
                worm.step(Worm.UP);
            }else if(dir.equalsIgnoreCase("s")){
                worm.step(Worm.DOWN);
            }else if(dir.equalsIgnoreCase("a")){
                worm.step(Worm.LEFT);
            }else if(dir.equalsIgnoreCase("d")){
                worm.step(Worm.RIGHT);
            }else if(dir.equalsIgnoreCase("q")){
                System.out.println("退出");
                break;
            }else{
                worm.step();
            }

        }
    }
}
