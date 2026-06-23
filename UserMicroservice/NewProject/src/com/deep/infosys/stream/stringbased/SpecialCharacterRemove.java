package com.deep.infosys.stream.stringbased;

public class SpecialCharacterRemove {
    public static void main(String[] args) {
//        Remove special characters from a string.

        String str = "abc#$%";

        String s = str.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(s);

    }
}