package com.deep.infosys.stream.Set.advance;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SetSTringLength {
    public static void main(String[] args) {
        //{"java","aws","docker","go"}

        Set<String> set = Set.of("java", "aws","azu", "docker", "go");

        Map<Integer, List<String>> collect = set.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.toList()
        ));
        System.out.println(collect);

    }
}
