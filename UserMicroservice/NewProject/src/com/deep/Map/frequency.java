package com.deep.Map;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequency {
    public static void main(String[] args) {
//        ["java","aws","java","docker"]
        List<String> list = List.of("java", "aws", "java", "docker");

        Map<String, Long> collect =
                list.stream().collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));

        System.out.println(collect);

    }
}
