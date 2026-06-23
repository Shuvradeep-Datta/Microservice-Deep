package com.deep.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertKeyToUpperCase {
    public static void main(String[] args) {
//        {"java":10, "spring":20}
        Map<String, Integer> integerMap = Map.of("java", 10, "spring", 20);
        LinkedHashMap<String, Integer> collect = integerMap.entrySet().stream().collect(Collectors.toMap(
                t -> t.getKey().toUpperCase(),
                e -> e.getValue(),
                (a, b) -> a,
                LinkedHashMap::new
        ));
        System.out.println(collect);
    }
}
