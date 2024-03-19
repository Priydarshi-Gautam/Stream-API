package com.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        List<String> name = List.of("akash", "Singh", "sunil");
        List<String> stringList = name.stream().filter(e -> e.endsWith("l")).collect(Collectors.toList());
        System.out.println(stringList);


        List<Integer> list = List.of(7, 2, 1, 3, 8, 4);

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


