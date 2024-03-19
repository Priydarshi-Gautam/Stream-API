package com.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TypeOfWayToCreatingStream {
    public static void main(String[] args) {

        // Way 1

        IntStream stream1 = Arrays.stream(new int[]{2, 3, 9, 4, 6});
        stream1.forEach(value -> System.out.println(value));

        // Way 2

        List list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(5);
        list.forEach(e-> System.out.println(e));

        // Way 3

        IntStream stream = Arrays.stream(new int[]{4, 3, 2, 1, 5});
        stream.forEach(value -> System.out.println(value));

        //Stream<String> streamBuilder =
        //        Stream.<String>builder().add("a").add("b").add("c").build();

        Stream<String> add = Stream.<String>builder().add("a").add("b").build();
        add.forEach(value-> System.out.println(value));
        System.out.println(add);

        List<String> a = List.of("a", "b");
        a.forEach(value-> System.out.println(value));
        }
}
