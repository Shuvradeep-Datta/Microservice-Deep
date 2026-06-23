package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;
import java.util.List;

public class DuplicateString {
    public static void main(String[] args) {
        String[] str = {"java", "aws", "java", "docker"};
        List<String> list = Arrays.stream(str).distinct().toList();
        System.out.println(list);
    }
}
