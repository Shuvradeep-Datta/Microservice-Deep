package com.deep.infosys.stream.stringbased;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWord {
    public static void main(String[] args) {
        String sentence = "Java   Concept   of  the   Day";
        long count = Arrays.stream(sentence.replaceAll("\\s+", " ").split(" ")).map(String::valueOf).count();

        System.out.println(count);

    }
}
