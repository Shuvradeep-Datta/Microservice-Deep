package com.deep.infosys;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeOfTwoArray {
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1,1,8};

        int[] b = new int[] {8, 3, 9, 5};

        int[] mergeArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(mergeArray));


        //Without duplicates
        int[] mergeArray1 = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
                System.out.println(Arrays.toString(mergeArray1));

    }
}
