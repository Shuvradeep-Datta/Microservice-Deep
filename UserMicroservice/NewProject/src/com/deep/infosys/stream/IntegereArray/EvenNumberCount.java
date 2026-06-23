package com.deep.infosys.stream.IntegereArray;

import java.util.Arrays;

public class EvenNumberCount {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5, 6};
        long count = Arrays.stream(arr).filter(t -> t % 2 == 0).count();
        System.out.println(count);


        //Odd Number Count
        long count1 = Arrays.stream(arr).filter(t -> t % 2 == 1).count();
        System.out.println(count1);
    }
}
