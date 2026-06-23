package com.deep.infosys.stream.stringbased;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedWord {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day Java ";

        Map<String, Long> freqMap = Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));

        String s = freqMap.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
        System.out.println(s);



    }
}
