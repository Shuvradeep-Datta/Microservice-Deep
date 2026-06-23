package com.deep.infosys;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparationOfOddEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> oddEvenList = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        Set<Map.Entry<Boolean, List<Integer>>> entries = oddEvenList.entrySet();

        for (Map.Entry<Boolean, List<Integer>> entry: entries){
            if(entry.getKey()){
                System.out.println("Even number are.....");
            }else {
                System.out.println("Odd Numbers are....");
            }


            List<Integer> value = entry.getValue();

            for (Integer v: value){
                System.out.println(v);
            }

        }


    }
}
