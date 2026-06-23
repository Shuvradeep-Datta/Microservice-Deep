package com.deep.infosys.stream.stringbased;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";


        List<String> list1 = Arrays.stream(str1.split("")).sorted().toList();
        System.out.println(list1);
        List<String> list2 = Arrays.stream(str2.split("")).sorted().toList();
        System.out.println(list2);
        boolean isAnagram = list1.equals(list2);
        System.out.println(isAnagram);


    }
}
