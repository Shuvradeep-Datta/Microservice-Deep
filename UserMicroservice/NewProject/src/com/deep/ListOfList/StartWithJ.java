package com.deep.ListOfList;

import java.util.Arrays;
import java.util.List;

public class StartWithJ {
    public static void main(String[] args) {
        //[["java","spring"], ["aws","junit"], ["javascript"]]

        List<List<String>> list = Arrays.asList(
                Arrays.asList("java","spring"),
                Arrays.asList("aws","junit"),
                Arrays.asList("javascript")
        );

        long count = list.stream().flatMap(List::stream).filter(t -> t.startsWith("j")).count();
        System.out.println(count);

    }
}
