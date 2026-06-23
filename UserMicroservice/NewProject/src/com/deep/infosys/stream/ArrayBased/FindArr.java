package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;
import java.util.List;

public class FindArr {
    public static void main(String[] args) {
//        Input 1: {"java", "spring", "aws"}
//        Input 2: {"java", "aws"}

        String[] arr1 = {"java", "spring", "aws"};
        String[] arr2 = {"java", "aws"};

        List<String> list = Arrays.stream(arr1).filter(t -> Arrays.stream(arr2).noneMatch(s -> s.equals(t))).toList();
        System.out.println(list);
    }
}
