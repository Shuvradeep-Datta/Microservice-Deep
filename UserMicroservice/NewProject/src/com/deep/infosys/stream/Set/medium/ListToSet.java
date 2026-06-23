package com.deep.infosys.stream.Set.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {
    public static void main(String[] args) {
//        1,2,3,2,4,5,1

        List<Integer> list = Arrays.asList(1,2,3,2,4,5,1);
        Set<Integer> collect = list.stream().collect(Collectors.toSet());
        System.out.println(collect);
    }
}
