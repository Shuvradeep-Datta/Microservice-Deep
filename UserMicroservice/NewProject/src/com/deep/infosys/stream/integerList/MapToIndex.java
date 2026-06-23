package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToIndex {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 20, 5, 40);
        Map<Integer, List<Integer>> collect = IntStream.range(0, list.size()).boxed().collect(Collectors.groupingBy(
                i -> list.get(i),
                Collectors.toList()
        ));
        System.out.println(collect);

    }
}
