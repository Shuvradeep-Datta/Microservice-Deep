package com.deep.Map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstLetterFrequency {
    public static void main(String[] args) {
        //["java","spring","aws","docker"]

        List<String>list = List
                .of("java","spring","aws","docker");

        Map<Character, Long> collect = list.stream().collect(Collectors.groupingBy(t -> t.charAt(0), Collectors.counting()));
        System.out.println(collect);
    }
}
