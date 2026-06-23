package com.deep.infosys.stream.Set.medium;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueBetweenTwo {
    //set1 = {1,2,3,4,5}
    //set2 = {4,5,6,7,8}

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5);
        Set<Integer> set2 = Set.of(4, 5, 6, 7, 8);

        Set<Integer> uniqueBetweenTwo = Stream.concat(set1.stream().filter(t -> !set2.contains(t)), set2.stream().filter(s -> !set1.contains(s))).collect(Collectors.toSet());
        System.out.println(uniqueBetweenTwo);
    }
}
