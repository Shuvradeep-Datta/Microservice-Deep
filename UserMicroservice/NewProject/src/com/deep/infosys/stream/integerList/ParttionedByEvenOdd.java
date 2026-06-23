package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ParttionedByEvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 21, 32, 43, 54);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entries = collect.entrySet();

        for (Map.Entry<Boolean,List<Integer>>entry:entries){
            if(entry.getKey()){
                System.out.println("Even number are...");
            }else{
                System.out.println("Odd number are...");
            }

            List<Integer> list1 = entry.getValue();
            for (Integer l:list1){
                System.out.println(l);
            }
        }

    }
}
