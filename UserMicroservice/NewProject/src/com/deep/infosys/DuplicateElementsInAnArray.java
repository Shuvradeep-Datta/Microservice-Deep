package com.deep.infosys;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInAnArray {
    public static void main(String[] args) {
        int[] inputArray = {1,2,2,3,4,5,6,6,};
        Set<Integer> uniqueSet = new HashSet<>();

        int[] duplicateArray = Arrays.stream(inputArray).filter(t -> !uniqueSet.add(t)).toArray();
        System.out.println(Arrays.toString(duplicateArray));
    }
}
