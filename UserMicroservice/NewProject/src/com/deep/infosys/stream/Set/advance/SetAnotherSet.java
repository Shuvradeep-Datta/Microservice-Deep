package com.deep.infosys.stream.Set.advance;

import java.util.Set;

public class SetAnotherSet {
    public static void main(String[] args) {
//        Set1 = {1,2,3}
//        Set2 = {1,2,3,4,5}

        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(1, 2, 3, 4, 5);
        boolean isSetAnother = set2.containsAll(set1);
        System.out.println(isSetAnother);
    }
}
