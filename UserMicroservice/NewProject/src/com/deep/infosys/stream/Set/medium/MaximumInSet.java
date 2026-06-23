package com.deep.infosys.stream.Set.medium;

import java.util.List;
import java.util.Set;

public class MaximumInSet {
    public static void main(String[] args) {
        //{1, 5, 9, 2}
        Set<Integer> set = Set.of(1, 5, 9, 2);
        Integer max = set.stream().max(Integer::compareTo).get();
        System.out.println(max);
        Integer min = set.stream().min(Integer::compareTo).get();
        System.out.println(min);


    }
}
