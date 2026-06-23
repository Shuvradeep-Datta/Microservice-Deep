package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringFirstCharacter {
    public static void main(String[] args) {
        String[] str = {"java", "javascript", "spring", "sql"};

        Map<Character, List<String>> collect = Arrays.stream(str).collect(Collectors.groupingBy(
                t -> t.charAt(0)
        ));
        System.out.println(collect);


    }
}
