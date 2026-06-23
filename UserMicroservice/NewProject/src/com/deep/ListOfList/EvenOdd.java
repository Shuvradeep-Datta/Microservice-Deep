package com.deep.ListOfList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
//        [[1,2,3], [4,5,6]]

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6)
        );

        Map<Boolean,List<Integer>> map = list.stream().flatMap(List::stream).collect(Collectors.partitioningBy(
                i->i%2==0
        ));
        System.out.println("Even number..."+map.get(true));
        System.out.println("Odd Number.."+map.get(false));
    }
}
