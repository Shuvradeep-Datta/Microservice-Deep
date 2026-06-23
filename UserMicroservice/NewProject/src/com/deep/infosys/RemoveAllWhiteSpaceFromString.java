package com.deep.infosys;

public class RemoveAllWhiteSpaceFromString {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        String newString = str.replaceAll("\\s", "");
        System.out.println(newString);
    }
}
