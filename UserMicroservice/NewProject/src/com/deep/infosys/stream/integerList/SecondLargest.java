package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 40, 20, 5, 40);
        Integer i = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(i);
    }
}
