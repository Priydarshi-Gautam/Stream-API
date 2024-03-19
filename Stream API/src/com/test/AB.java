package com.test;

public class AB implements A {
    @Override
    public int sum(int x, int y) {

        return x + y;
    }

    public static void main(String[] args) {
        A d = (x, y) -> (x - y);
        int sum = d.sum(2, 7);
        System.out.println(sum);
    }
}