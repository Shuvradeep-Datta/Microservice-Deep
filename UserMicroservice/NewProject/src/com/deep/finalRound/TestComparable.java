package com.deep.finalRound;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        List<ComparableExample> list = Arrays.asList(
                new ComparableExample(3, "John", 45000),
                new ComparableExample(1, "Amit", 55000),
                new ComparableExample(2, "Kiran", 50000)
        );
        System.out.println("Before Sorting:");
        list.forEach(System.out::println);

        Collections.sort(list);   // Uses compareTo()

        System.out.println("\nAfter Sorting (By ID - Comparable):");
        list.forEach(System.out::println);

    }
}
