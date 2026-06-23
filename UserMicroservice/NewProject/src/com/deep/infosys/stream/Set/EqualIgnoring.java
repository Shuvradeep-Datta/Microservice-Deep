package com.deep.infosys.stream.Set;

import java.util.Set;

public class EqualIgnoring {
    public static void main(String[] args) {
        //{1,2,3} and {3,2,1}
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 2, 1);

        boolean isEquals = set1.stream().anyMatch(set2::contains);
        System.out.println(isEquals);
    }
}
