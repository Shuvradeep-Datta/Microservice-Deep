package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Top3Largest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(50, 20, 40, 10, 90, 70);
        Set<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toSet());
        System.out.println(collect);
    }
}