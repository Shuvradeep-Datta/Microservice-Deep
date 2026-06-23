package com.deep.ListOfList;

import java.util.Arrays;
import java.util.List;

public class ListListToSingleList {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7,8,9)

        );

        List<Integer> list1 = list.stream().flatMap(List::stream).toList();
        System.out.println(list1);
    }
}
