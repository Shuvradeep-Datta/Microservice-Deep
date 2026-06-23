package com.deep.infosys.stream.IntegereArray.Advance;

import java.util.Arrays;
import java.util.Comparator;

public class ClosestNumberArray {
    public static void main(String[] args) {
//        Find closest number to a given target.

        int[] arr = {10, 22, 14, 26, 35};
        int target = 20;

        int i = closestNumberFind(arr, target);
        System.out.println(i);


    }

    private static int closestNumberFind(int[] arr, int target) {

        Integer i = Arrays.stream(arr).boxed().min(Comparator.comparingInt(n -> Math.abs(n - target))).orElse(null);
        return i;
    }

}
