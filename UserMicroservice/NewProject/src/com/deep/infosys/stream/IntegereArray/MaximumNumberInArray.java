package com.deep.infosys.stream.IntegereArray;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumNumberInArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        //Max
        int maxNumber = Arrays.stream(array).max().getAsInt();
        System.out.println(maxNumber);
        //Min
        int minNumber = Arrays.stream(array).min().getAsInt();
        System.out.println(minNumber);

        //Sum
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);

    }
}
