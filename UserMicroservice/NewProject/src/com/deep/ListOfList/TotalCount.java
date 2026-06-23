package com.deep.ListOfList;

import java.util.Arrays;
import java.util.List;

public class TotalCount {
    public static void main(String[] args) {
        //[[1,2,3], [4,5], [6,7,8,9]]

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7,8,9)
        );
        long a = list.stream().flatMap(List::stream).count();
        System.out.println(a);
    }
}
