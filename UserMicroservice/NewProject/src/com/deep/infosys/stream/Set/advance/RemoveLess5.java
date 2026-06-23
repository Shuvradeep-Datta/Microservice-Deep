package com.deep.infosys.stream.Set.advance;

import java.util.Set;
import java.util.stream.Collectors;

public class RemoveLess5 {
    public static void main(String[] args) {
//        {1,2,3,4,5,6,7}

        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5, 6, 7);

        Set<Integer> collect = set1.stream().filter(t -> t > 5).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
