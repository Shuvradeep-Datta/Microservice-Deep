package com.deep.infosys;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterCountString {
    public static void main(String[] args) {
        String str = "JavaJ2EE".replaceAll("\\s+","");
        Map<String, Long> collectorCountingMap = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<String> uniqueWord = new LinkedHashSet<>();
        Map<String, Long> duplicate = collectorCountingMap.entrySet().stream().filter(
                t -> t.getValue() >1
        ).map(t -> t.getKey()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Set<Map.Entry<String, Long>> entries = duplicate.entrySet();

        for (Map.Entry<String, Long> entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());

        }


    }
}
