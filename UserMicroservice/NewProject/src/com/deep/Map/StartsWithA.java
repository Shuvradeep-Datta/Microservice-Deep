package com.deep.Map;

import java.util.List;
import java.util.Map;

public class StartsWithA {
    public static void main(String[] args) {
        //{"aws":15, "azure":40, "docker":5}
        Map<String, Integer> integerMap = Map.of("aws", 15, "azure", 40, "docker", 5);
        List<String> list = integerMap.entrySet().stream().filter(t -> t.getKey().startsWith("a")).map(t -> t.getKey()).toList();
        System.out.println(list);
    }
}
