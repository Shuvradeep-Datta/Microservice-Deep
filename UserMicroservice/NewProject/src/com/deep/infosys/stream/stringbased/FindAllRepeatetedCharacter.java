package com.deep.infosys.stream.stringbased;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllRepeatetedCharacter {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        String collect = str.replaceAll(" ", "").toLowerCase().chars().mapToObj(c -> (char) c).sorted().map(String::valueOf).collect(Collectors.joining());
        System.out.println(collect);


    }
}
