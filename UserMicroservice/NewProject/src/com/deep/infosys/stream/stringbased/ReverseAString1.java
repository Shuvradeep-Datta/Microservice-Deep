package com.deep.infosys.stream.stringbased;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseAString1 {
    public static void main(String[] args) {
        //    Stream + reduce
        String str = "Java Concept Of Day";

        String collect = Arrays.stream(str.split(" ")).map(t -> new StringBuilder(t).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(collect);

    }


}
