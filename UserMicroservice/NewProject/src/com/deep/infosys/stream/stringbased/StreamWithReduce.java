package com.deep.infosys.stream.stringbased;

import java.util.Arrays;

public class StreamWithReduce {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        String reverse = str.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (a, b) -> b + a);
        System.out.println(reverse);
    }
}
