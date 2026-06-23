package com.deep.infosys.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Special {
    public static void main(String[] args) {
        String input = "ind@@i@dd-is-my-country-today-is-a-beautiful-day";
        String newWord = input.split("-")[0].trim();
        String collect = Arrays.stream(newWord.split("")).filter(t -> t.chars().noneMatch(s -> !Character.isLetterOrDigit(s))).collect(Collectors.joining());
        System.out.println(collect);

    }
}
