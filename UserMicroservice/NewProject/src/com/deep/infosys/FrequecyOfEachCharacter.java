package com.deep.infosys;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequecyOfEachCharacter {
    public static void main(String[] args) {
        String str = "Java Compile Of The Day";

        Map<Character, Long> collectorCountingMap = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collectorCountingMap);
    }
}
