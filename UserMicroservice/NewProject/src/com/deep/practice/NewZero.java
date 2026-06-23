package com.deep.practice;

import java.util.*;

public class NewZero {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,3,0,4,5,6,0};
        List<Integer> zeroesOnly = Arrays.stream(arr).boxed().filter(num -> num == 0).toList();
        List<Integer> nonZeroes = Arrays.stream(arr).boxed().filter(num -> num != 0).toList();
        System.out.println(nonZeroes);
        System.out.println(zeroesOnly);

        Collection<Integer> newList = new ArrayList<>();

        newList.addAll(nonZeroes);
        newList.addAll(zeroesOnly);

        System.out.println(newList);

        Integer[]   array = newList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
    }
}
