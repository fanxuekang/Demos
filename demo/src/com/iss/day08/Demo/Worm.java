package com.iss.day08.Demo;

import java.util.LinkedList;

/**
 * 控制台打印贪吃蛇
 * 1） 蛇是Node的线性集合 ，节点在面板中要有自己的坐标
 * 2） 蛇可以走，可以向指定方向与当前方向走一步，但不能反向
 * 3） 蛇可以吃豆子（坐标）
 * 4） 蛇在面板（控制台）上走，面板控制行列坐标，面板可以提供打印方法，显示一条蛇
 * 5） 重构蛇类，提供检查坐标是否在蛇身上的方法。
 * 6)   测试
 */

public class Worm {
        //定义集合存放蛇身上的节点
    private  LinkedList<Node> nodes = new LinkedList<Node>();
    private int dir; //默认行走方向

    public static final int UP = -10;
    public static final int DOWN = 10;
    public static final int LEFT = -1;
    public static final int RIGHT = 1;

    //画蛇
    public Worm(){
        nodes.add(new Node(1,1));
        nodes.add(new Node(1,2));
        nodes.add(new Node(1,3));
        nodes.add(new Node(1,4));
        nodes.add(new Node(1,5));
        dir = RIGHT;//默认向右走


    }

    //指定蛇
    public Worm(LinkedList<Node> nodes){
        this.nodes.clear();
        this.nodes.addAll(nodes);//复制集合内容

    }

    //蛇走一步
    public void step(){
        Node head = nodes.getFirst();
        //根据当前方向计算新节点
        int i = head.getI() + dir/10;
        int j = head.getJ() + dir%10;
        head = new Node(i,j);
        //插入新节点到头部
        nodes.addFirst(head);
        //删除末尾节点
        nodes.removeLast();
    }

    public void step(int dir){
        if(this.dir + dir == 0){
            throw new RuntimeException("不能反方向行走！");

        }
        this.dir = dir;
        step();
    }

    //判断当前是否包含该节点
    public boolean contains(int i,int j){
        return nodes.contains(new Node(i,j));
    }

    @Override
    public String toString() {
        return nodes.toString();
    }
}
