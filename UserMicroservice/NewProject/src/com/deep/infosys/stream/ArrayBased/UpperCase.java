package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;

public class UpperCase {
    public static void main(String[] args) {
        String arr[] = {"java", "spring", "aws"};

        Object[] array = Arrays.stream(arr).map(t -> t.toUpperCase()).toArray();
        System.out.println(Arrays.toString(array));


    }
}
