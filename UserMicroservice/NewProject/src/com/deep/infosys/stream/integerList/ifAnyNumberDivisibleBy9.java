package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;

public class ifAnyNumberDivisibleBy9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 8, 18, 22);
        boolean b = list.stream().anyMatch(i -> i % 9 == 0);
        System.out.println(b);
    }
}
