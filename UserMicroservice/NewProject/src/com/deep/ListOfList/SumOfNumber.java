package com.deep.ListOfList;

import java.util.Arrays;
import java.util.List;

public class SumOfNumber {
    public static void main(String[] args) {
//        [[1,2,3], [4,5], [6,7,8,9]]
        List<List<Integer>> list1 = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7,8,9)
        );

        int sum = list1.stream().flatMap(List::stream).reduce(0,(a,b)->a+b);
        System.out.println(sum);


        //Maximum Number

//        [[1,2,3], [10,5], [6,7,8]]
        List<List<Integer>> list = List.of(
                List.of(1,2,3),
                List.of(10,5),
                List.of(6,7,8)

        );

        Integer i = list.stream().flatMap(List::stream).max(Integer::compare).get();
        System.out.println(i);


    }
}
