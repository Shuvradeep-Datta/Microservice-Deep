package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;

public class AllNumberPositiveCheck {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> list1 = list.stream().filter(i -> i > 0).toList();
        System.out.println(list1);
    }
}
