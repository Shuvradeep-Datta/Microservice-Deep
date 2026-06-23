package com.deep.infosys.stream.stringbased.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java8", "spring", "aws3", "docker");

        List<String> list1 = list.stream().filter(ch -> ch.chars().noneMatch(Character::isDigit)).toList();
        System.out.println(list1);
    }
}
