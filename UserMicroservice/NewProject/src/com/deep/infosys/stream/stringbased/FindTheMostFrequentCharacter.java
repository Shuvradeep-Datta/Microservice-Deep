package com.deep.infosys.stream.stringbased;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheMostFrequentCharacter {
    public static void main(String[] args) {
        String str = "bannanannananna Chaai";

        Map<Character, Long> freqMap = str.replaceAll(" ","").toLowerCase().chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));

        Character c = freqMap.entrySet().stream().min(Comparator.comparing(Map.Entry::getValue)).map(t -> t.getKey()).orElse(null);
        System.out.println(c);


    }
}
