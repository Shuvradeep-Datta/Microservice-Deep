package com.deep.infosys.stream.Set.advance;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSingleSet {
    public static void main(String[] args) {
        //[ {"java", "aws"}, {"aws","kafka"} ]

        List<Set<String>> listOfString = List.of(
                Set.of("java", "aws"),
                Set.of("aws", "kafka")
        );
        Set<String> collect = listOfString.stream().flatMap(Set::stream).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
