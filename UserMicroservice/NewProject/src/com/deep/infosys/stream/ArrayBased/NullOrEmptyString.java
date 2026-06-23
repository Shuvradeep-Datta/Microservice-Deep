package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class NullOrEmptyString {
    public static void main(String[] args) {
        String str[] = {"java", "", null, "aws"};
        Set<String> collect = Arrays.stream(str).filter(Objects::nonNull).filter(t -> !t.isEmpty()).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
