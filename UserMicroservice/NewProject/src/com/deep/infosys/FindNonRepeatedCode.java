package com.deep.infosys;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatedCode {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day".replaceAll("\\s","").toLowerCase();
        LinkedHashMap<String, Long> countingMap = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String s = countingMap.entrySet().stream().filter(
                t -> t.getValue() == 1
        ).map(
                t -> t.getKey()
        ).findFirst().get();

        System.out.println(s);

    }
}
