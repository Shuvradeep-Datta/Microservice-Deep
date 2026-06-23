package com.deep.infosys.stream.stringbased;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestWord {
    public static void main(String[] args) {
        String str = "Java Concept Of The Data";

        String s = Arrays.stream(str.split("\\s+")).max(Comparator.comparing(String::length)).orElse(null);
        System.out.println(s);

    }
}
