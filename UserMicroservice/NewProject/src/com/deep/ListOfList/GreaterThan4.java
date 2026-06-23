package com.deep.ListOfList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GreaterThan4 {
    public static void main(String[] args) {
        //[["java","spring"], ["aws","docker"]]
        List<List<String>> list = Arrays.asList(
                Arrays.asList("java", "spring"),
                Arrays.asList("aws", "docker")
        );

        Set<String> collect = list.stream().flatMap(List::stream).filter(t -> t.length() > 4).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
