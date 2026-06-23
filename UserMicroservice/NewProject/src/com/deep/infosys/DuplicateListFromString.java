package com.deep.infosys;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateListFromString {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> collect = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
