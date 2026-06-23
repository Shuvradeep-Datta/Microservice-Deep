package com.deep.infosys;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnIntegerArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        int[] array1 = IntStream.rangeClosed(1, array.length).map(t -> array[array.length - t]).toArray();
        System.out.println(Arrays.toString(array1));
    }
}
