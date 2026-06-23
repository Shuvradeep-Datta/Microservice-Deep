package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateStr {
    public static void main(String[] args) {
        String str[] = {"java", "aws", "java", "docker", "aws"};
        Set<String> set = new HashSet<>();
        String collect = Arrays.stream(str).filter(str1 -> !set.add(str1)).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
