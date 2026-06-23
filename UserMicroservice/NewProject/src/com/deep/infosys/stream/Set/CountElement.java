package com.deep.infosys.stream.Set;

import java.util.Set;

public class CountElement {
    public static void main(String[] args) {
        Set<String> javaElements = Set.of("java", "spring", "aws");
        long count = javaElements.stream().count();
        System.out.println(count);

    }
}
