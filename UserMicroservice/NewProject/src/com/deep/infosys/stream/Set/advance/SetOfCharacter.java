package com.deep.infosys.stream.Set.advance;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class SetOfCharacter {
    public static void main(String[] args) {
        String str = "java";
        Set<Character> collect = str.chars().mapToObj(t -> (char) t).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
