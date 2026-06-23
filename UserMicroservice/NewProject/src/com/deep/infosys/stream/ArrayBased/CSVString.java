package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CSVString {
    public static void main(String[] args) {
        String str[] = {"java", "aws", "java", "docker"};

        String collect = Arrays.stream(str).collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect);
    }
}
