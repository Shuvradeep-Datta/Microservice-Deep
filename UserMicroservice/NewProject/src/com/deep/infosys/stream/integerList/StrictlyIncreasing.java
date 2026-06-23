package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;

public class StrictlyIncreasing {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 5, 6, 10);
        boolean strictlyIncreasing = isStrictlyIncreasing(list);
        System.out.println(strictlyIncreasing);

    }

    private static boolean isStrictlyIncreasing(List<Integer> list) {
        for(int i=1;i<list.size();i++){
            if(list.get(i)<=list.get(i-1)){
                return false;
            }
        }
        return true;
    }
}
