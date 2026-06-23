package com.deep.ListOfList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfList {
    public static void main(String[] args) {
//        [[1,2,2], [3,1], [2,4]]

        List<List<Integer>> list = Arrays.asList(
            Arrays.asList(1,2,2),
            Arrays.asList(3,1),
            Arrays.asList(2,4)
        );


       Map<List<Integer>,Integer> length =  list.stream().collect(Collectors.toMap(
                        Function.identity(),
                List::size

                )
        );
        System.out.println(length);


    }

}
