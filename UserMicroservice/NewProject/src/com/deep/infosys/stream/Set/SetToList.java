package com.deep.infosys.stream.Set;

import java.util.List;
import java.util.Set;

public class SetToList {
    public static void main(String[] args) {
        Set<String> set = Set.of("java", "aws", "docker");
        List<String> list = set.stream().toList();
        System.out.println(list);

    }
}
