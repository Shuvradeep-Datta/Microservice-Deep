package com.deep.infosys;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterInString {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+","").toLowerCase();
        Set<String> uniqueSet = new HashSet<>();
        Map<String, Long> duplicateSet = Arrays.stream(inputString.split("")).filter(t -> !uniqueSet.add(t))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(duplicateSet);

    }
}
