package com.deep.infosys.stream.stringbased;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "Java Concept Of The Day";
        String string = Arrays.stream(str.split("\\s+")).map(t -> new StringBuilder(t).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(string);

    }
}
