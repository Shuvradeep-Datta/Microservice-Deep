package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class GroupByLength {
    public static void main(String[] args) {
        String[] str = {"java", "aws", "spring", "api"};

      Map<Integer, List<String>>map =  Arrays.stream(str).collect(Collectors.groupingBy(
           String::length
        ));
        System.out.println(map);
    }
}
