package com.eundms.learnwithtestcode.java.sort;

public class Item implements Comparable<Item> {
    int x, y;

    public Item(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Item o) {
        return this.x - o.x;
    }

    @Override
    public String toString() {
        return "Item{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}