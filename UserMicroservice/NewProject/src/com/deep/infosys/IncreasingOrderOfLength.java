package com.deep.infosys;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class IncreasingOrderOfLength {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        List<String> list = listOfStrings.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(list);
    }
}
