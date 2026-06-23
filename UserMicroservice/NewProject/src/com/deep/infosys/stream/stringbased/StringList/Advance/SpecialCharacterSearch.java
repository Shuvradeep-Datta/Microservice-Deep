package com.deep.infosys.stream.stringbased.StringList.Advance;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SpecialCharacterSearch {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello!", "java", "test@", "#api");

        List<String> collect = list.stream().filter(t -> t.chars().anyMatch(s->!Character.isLetterOrDigit(s))).collect(Collectors.toList());
        System.out.println(collect);
    }
}
