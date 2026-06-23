package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LengthGreaterThan4 {
    public static void main(String[] args) {
//        Filter strings whose length > 4.

        String arr[] = {"java", "spring", "aws", "cloud"};

        Set<String> collect = Arrays.stream(arr).filter(t -> t.length() > 4).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
