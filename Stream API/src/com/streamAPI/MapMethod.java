package com.streamAPI;

import java.util.List;

public class MapMethod {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 13, 16, 14, 17, 19, 18);
        list.stream().map(i -> i*i).sorted().forEach(System.out::println);
    }
}
