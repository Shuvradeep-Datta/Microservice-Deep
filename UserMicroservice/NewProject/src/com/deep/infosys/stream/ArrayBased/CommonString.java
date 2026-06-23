package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonString {
    public static void main(String[] args) {
//        Input 1: {"java", "spring", "aws"}
//        Input 2: {"aws", "python", "java"}

        String[] str1 = {"java", "spring", "aws"};
        String[] str2 = {"aws", "python", "java"};

        Set<String> set2 = Arrays.stream(str2).collect(Collectors.toSet());

        Set<String> collect = Arrays.stream(str1).filter(set2::contains).collect(Collectors.toSet());
        System.out.println(collect);


    }
}
