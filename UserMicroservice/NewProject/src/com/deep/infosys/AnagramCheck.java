package com.deep.infosys;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        s1 = Arrays.stream(s1.split("")).map(t -> t.toLowerCase()).sorted().collect(Collectors.joining());

        s2 = Arrays.stream(s2.split("")).map(t->t.toLowerCase()).sorted().collect(Collectors.joining());

        if(s1.equals(s2)){
            System.out.println("It is Anagarams...");
        }else {
            System.out.println("It's not Anagrams");
        }
    }
}
