package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Threshold50 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 80, 30, 120, 5);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(
                i -> i < 50
        ));
      Set<Map.Entry<Boolean,List<Integer>>> entrySet =  collect.entrySet();
      for (Map.Entry<Boolean,List<Integer>> entry:entrySet){
          if(entry.getKey()){
              System.out.println("Less Than 50");
          }else {
              System.out.println("Greater Than  50");
          }
          List<Integer> list1 = entry.getValue();
          for (Integer a:list1){
              System.out.println(a);
          }
      }


    }
}
