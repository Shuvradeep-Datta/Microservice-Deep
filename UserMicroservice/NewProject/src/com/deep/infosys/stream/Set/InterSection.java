package com.deep.infosys.stream.Set;

import java.util.Set;
import java.util.stream.Collectors;

public class InterSection {
    public static void main(String[] args) {
//        set1 = {1,2,3,4,5}
//        set2 = {4,5,6,7,8}


        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5);
        Set<Integer> set2 = Set.of(4,5,6,7,8);
        Set<Integer> collect = set1.stream().filter(set2::contains).collect(Collectors.toSet());
        System.out.println(collect);

    }
}
