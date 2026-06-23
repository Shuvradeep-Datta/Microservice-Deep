package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 20, 7, 40, 3);
        List<Integer> list1 = list.stream().filter(i -> i % 2 == 0).toList();
        System.out.println(list1);

        //Filter number greater than 10
        List<Integer> list2 = Arrays.asList(10, 5, 20, 7, 40);
        Set<Integer> collect = list2.stream().filter(i -> i > 10).collect(Collectors.toSet());
        System.out.println(collect);

        //count total element
        List<Integer> list3 = Arrays.asList(2, 4, 6, 8, 10);
        long count = list3.stream().count();
        System.out.println(count);
        //even number count
        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6);
        long count1 = list4.stream().filter(i -> i % 2 == 0).count();
        System.out.println(count1);

        //sum all integer using reduce
        List<Integer> list5 = Arrays.asList(10, 20, 5, 8);
        Integer reduce = list5.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);


        //Max/Min
        List<Integer> list6 = Arrays.asList(12, 7, 40, 3, 19);
        Integer i = list6.stream().max(Integer::compare).orElse(null);
        System.out.println(i);


        //Comma Seperated
        List<Integer> list7 = Arrays.asList(10, 20, 30);
        String collect1 = list7.stream().map(i2 -> String.valueOf(i2)).collect(Collectors.joining(","));
        System.out.println(collect1);
    }
}
