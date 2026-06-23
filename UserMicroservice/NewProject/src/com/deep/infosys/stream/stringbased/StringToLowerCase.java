package com.deep.infosys.stream.stringbased;

import java.util.stream.Collectors;

public class StringToLowerCase {
    public static void main(String[] args) {
        String str = "JAVA CONCEPT OF THE DAY";

        String collect = str.chars().map(c -> (c >= 'A' && c <= 'Z') ? (c + 32) : c).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(collect);
    }
}
