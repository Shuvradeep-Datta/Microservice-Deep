package com.deep.Map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingMap {
    public static void main(String[] args) {
//        {"spring":20, "aws":15, "java":10}

        Map<String, Integer> spring = Map.of("spring", 20, "aws", 15, "java", 10);
        LinkedHashMap<String, Integer> collect = spring.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (a, b) -> a,
                LinkedHashMap::new
        ));
        System.out.println(collect);
        //descending
        LinkedHashMap<String, Integer> collect1 = spring.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (a, b) -> a,
                LinkedHashMap::new
        ));


    }
}
