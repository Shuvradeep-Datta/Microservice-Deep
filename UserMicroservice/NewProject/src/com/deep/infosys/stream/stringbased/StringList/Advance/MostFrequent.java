package com.deep.infosys.stream.stringbased.StringList.Advance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequent {
    public static void main(String[] args) {
        //Most Frequent
        List<String> list = Arrays.asList("aws", "java", "aws", "docker", "aws");
        String s = list.stream().collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        )).entrySet().stream().max(Comparator.comparingLong(t -> t.getValue())).map(Map.Entry::getKey).orElse(null);

        System.out.println(s);
    }
}
