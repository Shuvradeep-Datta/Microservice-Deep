package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortedList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,5,10,20,10,10,40);
        List<Integer> collect = list.stream().collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);
    }
}
