package com.deep.infosys;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DecimalListReversal {
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        System.out.println(decimalList);
        List<Double> collect = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Double> collect1 = decimalList.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
    }
}
