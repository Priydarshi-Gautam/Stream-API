package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
         int id;
        String name;
        int age;

    public Product(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
       List<Product> product= new ArrayList<>();
       product.add(new Product(1,"akash",29));
       product.add(new Product(2,"Vikas",25));
        List<Integer> collect = product.stream().filter(e -> e.age > 25)
                       .map(e -> e.age)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}

