package com.deep.infosys.stream.IntegereArray.Advance;

import java.util.Arrays;

public class ProductOfElements {
    public static void main(String[] args) {
        int[] n ={2, 3, 4};

        int product = Arrays.stream(n).reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }
}
