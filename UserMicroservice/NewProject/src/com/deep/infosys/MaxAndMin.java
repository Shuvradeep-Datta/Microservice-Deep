package com.deep.infosys;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        Integer min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(max);
        System.out.println(min);
    }
}
