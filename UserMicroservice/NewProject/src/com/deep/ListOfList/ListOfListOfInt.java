package com.deep.ListOfList;

import java.util.Arrays;
import java.util.List;

public class ListOfListOfInt {
    public static void main(String[] args) {
//        [[1,2], [3,4]]

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4)
        );
        List<String> list1 = list.stream().flatMap(List::stream).map(String::valueOf).toList();

    }
}
