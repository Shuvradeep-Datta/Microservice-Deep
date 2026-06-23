package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringDigit {
    public static void main(String[] args) {
        String str[] = {"java8", "spring", "aws3", "docker"};

        long a =Arrays.stream(str).filter(s->s.chars().anyMatch(Character::isDigit)).count();

        System.out.println(a);
    }
}
