package com.deep.infosys;
import java.util.*;
public class MultipleOf5 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> list = listOfIntegers.stream().filter(i -> i % 5 == 0).toList();
        System.out.println(list);
    }
}
