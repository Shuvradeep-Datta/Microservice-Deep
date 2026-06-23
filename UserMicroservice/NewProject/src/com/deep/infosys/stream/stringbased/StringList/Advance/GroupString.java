package com.deep.infosys.stream.stringbased.StringList.Advance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "javascript", "spring", "sql");

        Map<Character, List<String>> grouping = list.stream().collect(Collectors.groupingBy(
                t -> t.charAt(0),
                Collectors.toList()
        ));

        System.out.println(grouping);
    }
}
