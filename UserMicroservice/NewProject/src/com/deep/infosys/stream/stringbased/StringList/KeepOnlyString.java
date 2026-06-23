package com.deep.infosys.stream.stringbased.StringList;

import java.util.Arrays;
import java.util.List;

public class KeepOnlyString {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "spring", "docker", "aws");

        List<String> list1 = list.stream().filter(t -> t.contains("a")).toList();
        System.out.println(list1);
    }
}
