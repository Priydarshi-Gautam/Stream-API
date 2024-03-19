package com.streamAPI;

import java.util.stream.Stream;

public class StreamTable {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.empty();
        stream.forEach(System.out::println);
    }
}
