package com.deep.infosys.stream.stringbased;

import java.util.List;

public class StringToListOfCharacter {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        List<Character> list = str.replaceAll(" ", "").chars().mapToObj(t -> (char) t).toList();
        System.out.println(list);

    }
}
