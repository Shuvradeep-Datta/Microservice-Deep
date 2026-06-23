package com.deep.infosys.stream.Set.advance;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnFlattenSet {
    public static void main(String[] args) {
        //{ [1,2], [3,4], [5] }
        Set<List<Integer>> set = Set.of(
                List.of(1,2),
                List.of(3,4),
                List.of(5)
        );
        Set<Integer> collect = set.stream().flatMap(List::stream).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
