package com.deep.infosys.stream.IntegereArray;

import java.util.Arrays;

public class AverageNumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        double asDouble = Arrays.stream(arr).average().getAsDouble();
        System.out.println(asDouble);
    }
}
