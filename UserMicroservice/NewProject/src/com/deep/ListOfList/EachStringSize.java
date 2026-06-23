package com.deep.ListOfList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachStringSize {

    public static void main(String[] args) {
//        [["java","spring"], ["aws","docker"]]

        List<List<String>> list = Arrays
                .asList(
                        Arrays.asList("java", "spring"),
                        Arrays.asList("aws", "docker")
                );

        Map<String, Long> collect = list.stream().flatMap(List::stream).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()

        ));
        System.out.println(collect);
    }
}
