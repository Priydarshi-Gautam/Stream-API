package com.lambda;

public class Test implements MyInter{

    @Override
    public void good() {

    }

    public static void main(String[] args) {
        MyInter inter=()-> System.out.println("a");
        inter.good();

    }

}

