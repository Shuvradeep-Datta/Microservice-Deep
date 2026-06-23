package com.deep.ListOfList;

import java.util.Arrays;
import java.util.List;

public class MultiListToSingle {
    public static void main(String[] args) {
        List<List<String>> lstString = Arrays.asList(
                Arrays.asList("java","spring"),
                Arrays.asList("aws","docker"),
                Arrays.asList("kafka","java")
        );
        List<String> list = lstString.stream().flatMap(List::stream).toList();
        System.out.println(list);
    }
}
