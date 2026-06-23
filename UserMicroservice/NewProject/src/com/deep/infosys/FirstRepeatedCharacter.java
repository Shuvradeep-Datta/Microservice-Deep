package com.deep.infosys;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str = "Java Concept of the day".replaceAll("\\s","").toLowerCase();
        Map<String, Long> charCountMap = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        String collect = charCountMap.entrySet().stream().filter(
                t -> t.getValue() > 1
        ).map(
                t -> t.getKey()
        ).findFirst().get();

        System.out.println(collect);


    }
}
