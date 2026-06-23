package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveNegativenumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, -5, 20, -3, 40);
        Set<Integer> collect = list.stream().filter(i -> i > 0).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
