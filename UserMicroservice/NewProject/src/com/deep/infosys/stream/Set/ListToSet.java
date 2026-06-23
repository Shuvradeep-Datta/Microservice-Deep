package com.deep.infosys.stream.Set;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {
    public static void main(String[] args) {
        List<String> list = List.of("java", "aws", "java", "kafka");
        Set<String> collect = list.stream().collect(Collectors.toSet());
        System.out.println(collect);

    }
}
