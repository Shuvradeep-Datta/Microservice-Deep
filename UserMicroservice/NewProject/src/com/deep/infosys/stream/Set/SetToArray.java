package com.deep.infosys.stream.Set;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class SetToArray {
    public static void main(String[] args) {
//        Set.of(1,2,3,4)

        Set<Integer> integers = Set.of(1, 2, 3, 4);
        Object[] array = integers.stream().toArray();
        System.out.println(Arrays.toString(array));
    }
}
