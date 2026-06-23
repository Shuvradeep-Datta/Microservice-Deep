package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 21, 32, 43, 54, 67,97);
        Map<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(i -> i % 10));
        System.out.println(collect);
    }
}
