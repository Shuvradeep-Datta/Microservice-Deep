package com.deep.infosys.stream.stringbased.StringList;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonString {
    public static void main(String[] args) {
//        1️⃣3️⃣ Find common strings between two lists.
//
//        Input 1: ["java", "spring", "aws"]
//        Input 2: ["aws", "python", "java"]

        List<String> list1 = Arrays.asList("java", "spring", "aws");
        List<String>list2 = Arrays.asList("aws", "python", "java");
        Set<String> collect = list1.stream().filter(t -> list2.contains(t)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
