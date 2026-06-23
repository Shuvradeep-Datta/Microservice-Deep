package com.deep.infosys.stream.IntegereArray.Advance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PartioningODDEVEN {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Map<Boolean, List<Integer>> map = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entries = map.entrySet();

        for (Map.Entry<Boolean, List<Integer>> s:entries){
            if(s.getKey()){
                System.out.println("Even Number");
            }else {
                System.out.println("Odd Number");
            }

            List<Integer> list = s.getValue();

            for(int a:list){
                System.out.println(a);
            }

        }
    }
}
