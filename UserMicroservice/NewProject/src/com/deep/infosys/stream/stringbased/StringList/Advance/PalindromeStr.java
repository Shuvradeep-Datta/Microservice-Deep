package com.deep.infosys.stream.stringbased.StringList.Advance;

import java.util.Arrays;
import java.util.List;

public class PalindromeStr {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("madam", "java", "level", "spring");

        List<String> list = stringList.stream().filter(s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())).toList();
        System.out.println(list);
    }
}
