package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstRepeatedNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 20, 10, 40);
        int s = list.stream().collect(Collectors.groupingBy(
                Integer::intValue,
                LinkedHashMap::new,
                Collectors.counting()
        )).entrySet().stream().filter(i -> i.getValue() > 1).map(i -> i.getKey()).findFirst().orElse(null);
       System.out.println(s);
    }
}
