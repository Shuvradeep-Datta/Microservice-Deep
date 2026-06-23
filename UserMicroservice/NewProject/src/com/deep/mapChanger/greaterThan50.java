package com.deep.mapChanger;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class greaterThan50 {
    public static void main(String[] args) {
        Map<String, Integer> scores = Map.of(
                "A", 40,
                "B", 70,
                "C", 55,
                "D", 90
        );

        Set<String> collect = scores.entrySet().stream().filter(t -> t.getValue() > 50).map(s -> s.getKey()).collect(Collectors.toSet());
        System.out.println(collect);

    }
}
