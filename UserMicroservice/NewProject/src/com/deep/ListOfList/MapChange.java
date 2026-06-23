package com.deep.ListOfList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapChange {
    public static void main(String[] args) {
        //[[1,2,2], [3,1], [2,4]]

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2,2),
                Arrays.asList(3,1),
                Arrays.asList(2,4)
        );
        Map<Integer, Integer> collect =
                list.stream().flatMap(List::stream).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.collectingAndThen(
                        Collectors.counting(),
                        Long::intValue
                )
        ));

        System.out.println(
                collect
        );
    }
}
