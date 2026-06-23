package com.deep.infosys.stream.Set;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SymetricDiff {
    public static void main(String[] args) {
        //{1,2,3,4,5} minus {4,5,6,7,8}

        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5);
        Set<Integer> set2 = Set.of(4, 5, 6, 7, 8);
        Set<Integer> collect = Stream.concat(set1.stream().filter(t -> !set2.contains(t)), set2.stream().filter(s -> !set1.contains(s))).collect(Collectors.toSet());
        System.out.println(collect);

    }
}
