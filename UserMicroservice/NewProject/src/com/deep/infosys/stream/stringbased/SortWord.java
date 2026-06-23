package com.deep.infosys.stream.stringbased;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortWord {
    public static void main(String[] args) {
        String word = "Java Concept Of The Day";

        String string = Arrays.stream(word.split("\\s+")).sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.joining(" "));

        System.out.println(string);
    }
}
