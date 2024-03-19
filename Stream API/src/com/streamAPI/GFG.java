package com.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class GFG {

    public static void main(String[] args) throws Exception
    {

        List<String> arr1 = new ArrayList<String>();
        int count = 0;
        arr1.add("Geeks");
        arr1.add("For");
        arr1.add("Geeks");
        arr1.stream().forEach(s -> {

            // this will cause an error


            // print all elements
            System.out.println();
        });
    }
}

