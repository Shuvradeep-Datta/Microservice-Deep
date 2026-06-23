package com.deep.infosys.stream.stringbased;

import java.util.stream.Collectors;

public class RemoveAllDuplicate {
    public static void main(String[] args) {
        String str = "banana";
        String collect = str.chars().distinct().mapToObj(t -> String.valueOf((char) t)).collect(Collectors.joining());
        System.out.println(collect);
    }
}
