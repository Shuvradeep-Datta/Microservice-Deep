package com.deep.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveValue {
    public static void main(String[] args) {
//        {"java":10, "aws":15, "docker":5}

        Map<String, Integer> integerMap = Map.of("java", 10, "aws", 15, "docker", 5);
        Map<String, Integer> collect = integerMap.entrySet().stream().filter(i -> i.getValue() % 2 == 0).collect(Collectors.toMap(
                t -> t.getKey(),
                t -> t.getValue(),
                (a,b)->a,
                LinkedHashMap::new
        ));
        System.out.println(collect);
    }
}
