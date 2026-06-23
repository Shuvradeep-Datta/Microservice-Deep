package com.deep.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Map2Values {
    public static void main(String[] args) {
//        {"java":10, "spring":20, "aws":15}

        Map<String, Integer> integerMap = Map.of("java", 10, "spring", 20, "aws", 15);
        Set<Integer> collect = integerMap.entrySet().stream().map(Map.Entry::getValue).sorted(Comparator.reverseOrder()).limit(2).collect(Collectors.toSet());
        System.out.println(collect);

    }
}
