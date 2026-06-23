package com.deep.Map;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IncreaseValueBy5 {
    public static void main(String[] args) {
//        {"java":10, "aws":15}

        Map<String, Integer> integerMap = Map.of("java", 10, "aws", 15);
        Map<String, Integer> integerMap1 = integerMap.entrySet().stream().collect(Collectors.toMap(
                e -> e.getKey(),
                e -> e.getValue() + 5
        ));
        System.out.println(integerMap1);

    }
}
