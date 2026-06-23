package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;
import java.util.Comparator;

public class LongestArray {
    public static void main(String[] args) {
        String str[] = {"java", "spring", "aws", "microservices"};

        String s = Arrays.stream(str).max(Comparator.comparing(String::length)).get();
        System.out.println(s);
    }
}
