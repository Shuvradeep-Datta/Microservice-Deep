package com.deep.infosys.stream.stringbased;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        Map<String, Long> frequency = str.replaceAll(" ","").chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
                String::valueOf,
                Collectors.counting()
        ));
        System.out.println(frequency);
    }
}
