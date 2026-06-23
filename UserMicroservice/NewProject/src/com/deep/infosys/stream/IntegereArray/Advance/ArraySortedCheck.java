package com.deep.infosys.stream.IntegereArray.Advance;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySortedCheck {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        System.out.println( isArraySorted(num));
        
    }

    private static boolean isArraySorted(int[] num) {

        boolean b = IntStream.range(0, num.length - 1).allMatch(i -> num[i] <= num[i + 1]);
        return b;
    }
}
