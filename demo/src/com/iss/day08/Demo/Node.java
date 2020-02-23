package com.iss.day08.Demo;

import java.util.Objects;

public class Node {
    private int i,j;


    @Override
    public String toString() {
        return "["+i+","+j+"]";
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return i == node.i &&
                j == node.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public Node(){}
    public Node(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
