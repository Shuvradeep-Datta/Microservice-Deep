package com.deep.infosys.stream.stringbased;

import java.util.stream.Collectors;

public class RemoveCharacterFromOther {
    public static void main(String[] args) {
        String str1 = "abcdefxyz";   // original string
        String str2 = "bdfz";        // allowed characters

        String collect = str1.chars().mapToObj(t -> (char) t).filter(t -> str2.indexOf(t) != -1).map(String::valueOf).collect(Collectors.joining());
        System.out.println(collect);
    }
}
