package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AlphabeticallySort {
    public static void main(String[] args) {
        String str[] = {"banana", "apple", "cherry"};

        List<String> list = Arrays.stream(str).sorted().toList();
        System.out.println(list);
    }
}
