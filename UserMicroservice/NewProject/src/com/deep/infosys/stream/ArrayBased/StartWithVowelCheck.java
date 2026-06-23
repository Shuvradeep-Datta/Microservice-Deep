package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;

public class StartWithVowelCheck {
    public static void main(String[] args) {
        String[] str = {"apple", "java", "orange", "aws", "ice"};

        long count = Arrays.stream(str).filter(s -> !s.isEmpty()).filter(s -> "aeiouAEIOU".indexOf(s.charAt(0)) != -1)
                .count();
        System.out.println(count);

    }
}
