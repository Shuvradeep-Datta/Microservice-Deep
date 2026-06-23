package com.deep.infosys;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringusingStringBuffer {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        String collect = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(collect);


    }
}
