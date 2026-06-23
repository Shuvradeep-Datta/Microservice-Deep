package com.deep.Map;

import java.util.Map;
import java.util.stream.Collectors;

public class StringMapString {
    public static void main(String[] args) {
//        {"java":10, "aws":20}

        Map<String, Integer> integerMap = Map.of("java", 10, "aws", 20);
        Map<String, String> collect = integerMap.entrySet().stream().collect(Collectors.toMap(
                t -> t.getKey(),
                t -> String.valueOf(t.getValue())
        ));
        System.out.println(collect);
    }
}
