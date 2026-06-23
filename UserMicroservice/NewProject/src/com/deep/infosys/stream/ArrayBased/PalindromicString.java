package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;
import java.util.List;

public class PalindromicString {
    public static void main(String[] args) {
        String[] str = {"madam", "java", "level", "spring"};

        List<String> list = Arrays.stream(str).filter(th -> th.equalsIgnoreCase(new StringBuilder(th).reverse().toString())).toList();
        System.out.println(list);
    }
}
