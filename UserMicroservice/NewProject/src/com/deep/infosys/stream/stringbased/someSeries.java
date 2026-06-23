package com.deep.infosys.stream.stringbased;

import java.util.List;
import java.util.stream.Stream;

public class someSeries {
    public static void main(String[] args) {
        List<Integer> list = Stream.iterate(1, n -> n <= 10, n -> n + 1).toList();
        System.out.println(list);

    }
}
