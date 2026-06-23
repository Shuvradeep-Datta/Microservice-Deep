package com.deep.infosys.stream.Set.advance;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SetToMap {
    public static void main(String[] args) {
        Set<String> set = Set.of("java", "spring", "aws");

        Map<String, Integer> collect = set.stream().collect(Collectors.toMap(
                t -> t,
                String::length
        ));
        System.out.println(collect);

    }
}
