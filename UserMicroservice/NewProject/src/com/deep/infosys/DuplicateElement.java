package com.deep.infosys;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        HashSet<Integer> uniqueElements = new HashSet<>();
        List<Integer> duplicateElements = listOfIntegers.stream().filter(t -> !uniqueElements.add(t)).toList();
        System.out.println(duplicateElements);
    }
}
