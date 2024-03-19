package com.lambda;

public class SumInterImpl implements SumInter{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        SumInter sum = (a, b) ->
            a + b;
        int sum1 = sum.sum(2, 5);
        System.out.println(sum1);
    }
}
