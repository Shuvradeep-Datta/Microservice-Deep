package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplyEachNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 20, 40);

        Set<Integer> collect = IntStream.range(0, list.size()).mapToObj(i -> i * list.get(i)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
