package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class NullValueSafely {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, null, 20, null, 30);

        List<Integer> list1 = list.stream().filter(Objects::nonNull).toList();
        System.out.println(list1);
    }
}
