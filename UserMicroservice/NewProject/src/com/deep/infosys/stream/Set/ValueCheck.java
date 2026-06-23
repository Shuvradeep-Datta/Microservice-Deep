package com.deep.infosys.stream.Set;

import java.util.Set;

public class ValueCheck {
    public static void main(String[] args) {
//        Set.of(1,2,3,4) — check for 3

        Set<Integer> integerSet = Set.of(1, 2, 3, 4);

        boolean isThreeFound = integerSet.stream().anyMatch(t->t==3);

        System.out.println(isThreeFound);

    }
}
