package com.deep.infosys.stream.Set.medium;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ElementFind {
    public static void main(String[] args) {
//        "aws","azure","java","docker"

        List<String> list = List.of("aws", "azure", "java", "docker");

        Set<String> collect = list.stream().filter(t -> t.startsWith("a")).collect(Collectors.toSet());
        System.out.println(collect);


    }
}
