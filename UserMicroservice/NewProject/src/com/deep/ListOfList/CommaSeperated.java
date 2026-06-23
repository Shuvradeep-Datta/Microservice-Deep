package com.deep.ListOfList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeperated {
    public static void main(String[] args) {
//        [[1,2,3], [4,5], [6]]

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6)
        );

        String collect = list.stream().flatMap(List::stream).map(String::valueOf).collect(Collectors.joining(",", "\"", "\""));
        System.out.println(collect);

    }

}
