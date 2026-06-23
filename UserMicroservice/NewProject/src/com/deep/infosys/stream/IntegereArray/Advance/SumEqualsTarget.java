package com.deep.infosys.stream.IntegereArray.Advance;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumEqualsTarget {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8};
        int target = 9;

        sumEqualsTarget(arr, target);
//        System.out.println(i);
    }

    private static void sumEqualsTarget(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();


        Arrays.stream(arr).forEach(n->{

            int match = target-n;
            if(seen.contains(match)){
                System.out.println(n+ " "+match);
            }
            seen.add(n);
        });


    }
}
