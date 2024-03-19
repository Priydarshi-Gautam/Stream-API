package com.streamAPI;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,6,9,1,8,7,11);

        List<Integer> lists = list.stream().filter(l -> l % 2 == 0).collect(Collectors.toList());

        System.out.println(lists);

        // shorted method

        list.stream().sorted().forEach(System.out::println);

        //max method

        Integer max = list.stream().max(Integer::compareTo).get();
        System.out.println("max value "+ max);

        // min method

        Integer min = list.stream().min(Integer::compareTo).get();
        System.out.println("min value "+ min);

    }
}
