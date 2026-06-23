package com.deep.infosys.stream.stringbased.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqCheck {
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("java", "aws", "java", "docker", "aws");
//       Map<String,Long> newMap= list.stream().collect(Collectors.groupingBy(
//                Function.identity(),
//                Collectors.counting()
//        ));
//
//        System.out.println(newMap);
//    }


    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "aws", "java", "docker", "aws");

//        Duplicate String


        List<String> list1 = list.stream().collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        )).entrySet().stream().filter(i -> i.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println(list1);


    }
}
