package com.deep.ListOfList;

import java.util.Arrays;
import java.util.List;

public class InnerListcontains5 {
    public static void main(String[] args) {
//        [[1,2,3], [4,5], [6,7,8,9]]


        List<List<Integer>>list = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7,8,9)
        );

        boolean b = list.stream().anyMatch(t -> t.contains(5));
        System.out.println(b);
    }

}
