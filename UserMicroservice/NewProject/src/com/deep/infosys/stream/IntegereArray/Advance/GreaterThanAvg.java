package com.deep.infosys.stream.IntegereArray.Advance;

import java.util.Arrays;
import java.util.List;

public class GreaterThanAvg {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        double asDouble = Arrays.stream(arr).average().getAsDouble();
        System.out.println(asDouble);
        List<Integer> list = Arrays.stream(arr).filter(t -> t > asDouble).boxed().toList();
        System.out.println(list);

    }
}
