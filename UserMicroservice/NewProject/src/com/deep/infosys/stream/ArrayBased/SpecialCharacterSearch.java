package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;

public class SpecialCharacterSearch {
    public static void main(String[] args) {
        String[] s = {"hello!", "java", "test@", "#api"};

        long count = Arrays.stream(s).filter(t -> t.chars().anyMatch(ch->!Character.isLetterOrDigit(ch))).count();
        System.out.println(count);
    }
}
