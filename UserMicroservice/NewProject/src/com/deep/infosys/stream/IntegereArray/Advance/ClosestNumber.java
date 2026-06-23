package com.deep.infosys.stream.IntegereArray.Advance;

import java.util.Arrays;
import java.util.Comparator;

public class ClosestNumber {
    public static void main(String[] args) {
        int num[] = {10, 22, 14, 26, 35};
        int target = 20;

        int i = closetNumber(num, target);
        System.out.println(i);

    }

    private static int closetNumber(int[] num, int target) {
        Integer i = Arrays.stream(num).boxed().min(Comparator.comparingInt(n -> Math.abs(n - target))).orElse(null);
        return i;
    }
}
