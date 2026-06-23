package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;

public class PerfectSquare {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 9, 16, 20);
        List<Integer> list1 = list.stream().filter(t -> isPerfectSquare(t)).toList();
        System.out.println(list1);

    }

    private static boolean isPerfectSquare(int i) {
        int root = (int) Math.sqrt(i);
        return root*root == i;
    }
}
