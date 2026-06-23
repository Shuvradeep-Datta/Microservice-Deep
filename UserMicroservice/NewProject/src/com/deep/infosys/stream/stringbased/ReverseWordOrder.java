package com.deep.infosys.stream.stringbased;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWordOrder {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        String collect = Arrays.stream(str.split("\\s+")).collect(Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    Collections.reverse(list);
                    return String.join(" ",list);
                }
        ));
        System.out.println(collect);
    }
}
