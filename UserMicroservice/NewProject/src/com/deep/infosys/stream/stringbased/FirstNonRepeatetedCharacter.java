package com.deep.infosys.stream.stringbased;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatetedCharacter {
    public static void main(String[] args) {

        String str = "lbananac";
        String s = str.chars().mapToObj(t -> (char) t).collect(
                Collectors.groupingBy(
                        String::valueOf,
                        LinkedHashMap::new,
                        Collectors.counting()
                )
        ).entrySet().stream().filter(t -> t.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);

        System.out.println(s);


    }
}
