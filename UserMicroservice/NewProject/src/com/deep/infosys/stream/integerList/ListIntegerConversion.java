package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;

public class ListIntegerConversion {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("10", "20", "5");
        List<Integer> list1 = list.stream().map(t -> Integer.parseInt(t)).toList();

    }
}
