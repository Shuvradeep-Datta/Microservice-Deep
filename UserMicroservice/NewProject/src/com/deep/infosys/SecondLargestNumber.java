package com.deep.infosys;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,6,7,8,9};
        Integer i = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(i);
    }
}
