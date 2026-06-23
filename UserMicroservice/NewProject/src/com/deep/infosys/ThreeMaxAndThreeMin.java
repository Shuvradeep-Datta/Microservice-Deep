package com.deep.infosys;
import java.util.*;
public class ThreeMaxAndThreeMin {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("Three Maximum number are.....");
        List<Integer> maxNumber = listOfIntegers.stream().sorted().limit(3).toList();
        System.out.println(maxNumber);
        System.out.println("Three Minimum Number are......");
        List<Integer> minimum = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(minimum);




    }
}
