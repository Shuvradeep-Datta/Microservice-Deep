package com.deep.Map;

import java.util.Map;
import java.util.stream.Collectors;

public class MapSBokkad {
    public static void main(String[] args) {
//        {"java":10, "aws":15}
        Map<String, Integer> integerMap = Map.of("java", 10, "aws", 15);
        Map<String, Boolean> collect = integerMap.entrySet().stream().collect(Collectors.toMap(
                t -> t.getKey(),
                t -> t.getValue() > 10
        ));
        System.out.println(collect);
    }
}
